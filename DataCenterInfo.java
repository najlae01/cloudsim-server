package org.cloudbus.cloudsim.examples;

import java.util.LinkedList;
import java.util.List;

import org.cloudbus.cloudsim.Datacenter;
import org.cloudbus.cloudsim.Host;

public class DataCenterInfo {
	public String name;
	public int id;
	public List<HostInfo> hosts;

	public DataCenterInfo(Datacenter datacenter) {
		this.name = datacenter.getName();
		this.id = datacenter.getId();
		this.hosts = constructHostsList(datacenter.getHostList());
	}

	private List<HostInfo> constructHostsList(List<Host> hostList) {
		List<HostInfo> returnList = new LinkedList<HostInfo>();
		
		for(Host cloudsimHost : hostList) {
			HostInfo payloadHost = new HostInfo(cloudsimHost);
			returnList.add(payloadHost);
		}
		
		return returnList;
	}
	
	
}
