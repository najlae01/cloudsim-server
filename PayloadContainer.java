package org.cloudbus.cloudsim.examples;

import java.util.LinkedList;
import java.util.List;

import org.cloudbus.cloudsim.Datacenter;
import org.cloudbus.cloudsim.DatacenterBroker;
import org.cloudbus.cloudsim.Pe;
import org.cloudbus.cloudsim.core.CloudSim;

public class PayloadContainer {
	public List<DataCenterInfo> dataCenterList;
	public List<BrokerInfo> brokerList;
	public double clock;
	
	public PayloadContainer(List<Datacenter> datacenterList, List <DatacenterBroker> brokerList) {
		this.brokerList = constructBrokerList(brokerList);
		this.dataCenterList = constructDataCenterList(datacenterList);
		this.clock = CloudSim.clock();
	}

	public List<BrokerInfo> constructBrokerList(List<DatacenterBroker> list) {
		List<BrokerInfo> brokerList = new LinkedList<BrokerInfo>();
		
		for(DatacenterBroker cloudsimBroker : list) {
			BrokerInfo payloadBroker = new BrokerInfo(cloudsimBroker);
			brokerList.add(payloadBroker);
		}
		
		return brokerList;
	}
	
	public List<DataCenterInfo> constructDataCenterList(List<Datacenter> list) {
		List<DataCenterInfo> dataCenterList = new LinkedList<DataCenterInfo>();
		
		for(Datacenter cloudsimDatacenter : list) {
			DataCenterInfo payloadDatacenter = new DataCenterInfo(cloudsimDatacenter);
			dataCenterList.add(payloadDatacenter);
		}
		
		return dataCenterList;
	}
}