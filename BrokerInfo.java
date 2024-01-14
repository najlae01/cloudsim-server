package org.cloudbus.cloudsim.examples;

import java.util.LinkedList;
import java.util.List;

import org.cloudbus.cloudsim.Cloudlet;
import org.cloudbus.cloudsim.DatacenterBroker;
import org.cloudbus.cloudsim.Vm;

public class BrokerInfo {

	public List<VmInfo> vmList;
	public List<VmInfo> vmsCreatedList;
	public List<CloudletInfo> cloudletList;
	public List<CloudletInfo> cloudletSubmittedList;
	public List<CloudletInfo> cloudletReceivedList;
	public int id;
	

	public BrokerInfo(DatacenterBroker broker) {
		this.vmList = constructVmList(broker.getVmList());
		this.vmsCreatedList = constructVmList(broker.getVmsCreatedList());
		this.cloudletList = constructCloudletList(broker.getCloudletList());
		this.cloudletSubmittedList= constructCloudletList(broker.getCloudletSubmittedList());
		this.cloudletReceivedList= constructCloudletList(broker.getCloudletReceivedList());
		this.id = broker.getId();
	}

	
	private List<CloudletInfo> constructCloudletList(List<Cloudlet> list) {
		List<CloudletInfo> cloudletList = new LinkedList<CloudletInfo>();
		
		for(Cloudlet cloudsimCloudlet : list) {
			CloudletInfo payloadCloudlet = new CloudletInfo(cloudsimCloudlet);
			cloudletList.add(payloadCloudlet);
		}
		
		return cloudletList;
	}


	public List<VmInfo> constructVmList(List<Vm> list) {
		List<VmInfo> vmList = new LinkedList<VmInfo>();
		
		for(Vm cloudsimVm : list) {
			VmInfo payloadVm = new VmInfo(cloudsimVm);
			vmList.add(payloadVm);
		}
		
		
		return vmList;
	}
}
