package org.cloudbus.cloudsim.examples;

import java.util.LinkedList;
import java.util.List;

import org.cloudbus.cloudsim.Host;
import org.cloudbus.cloudsim.Pe;
import org.cloudbus.cloudsim.Vm;

public class HostInfo {
	/** The id of the host. */
	public int id;

	/** The storage capacity. */
	public long storage;

	/** The ram */
	public long ram;

	/** Bandwidth */
	public long bw;
	
	/** The list of VMs assigned to the host. */
	public List<VmInfo> vmList;

	/** The Processing Elements (PEs) of the host, that
         * represent the CPU cores of it, and thus, its processing capacity. */
	public List<PeInfo> peList;

	/** Tells whether this host is working properly or has failed. */
	public boolean failed;


	/** The datacenter where the host is placed. */
	public int datacenter;

	
	public HostInfo(Host cloudsimHost) {
		this.id = cloudsimHost.getId();
		this.storage = cloudsimHost.getStorage();
		this.ram = cloudsimHost.getRam();
		this.bw = cloudsimHost.getBw();
		this.datacenter = cloudsimHost.getDatacenter().getId();
		this.peList = constructPeList(cloudsimHost.getPeList());
		this.vmList = constructVmList(cloudsimHost.getVmList());
	}
	
	public List<VmInfo> constructVmList(List<Vm> list) {
		List<VmInfo> vmList = new LinkedList<VmInfo>();
		
		for(Vm cloudsimVm : list) {
			VmInfo payloadVm = new VmInfo(cloudsimVm);
			vmList.add(payloadVm);
		}
		
		
		return vmList;
	}
	
	public List<PeInfo> constructPeList(List<Pe> list) {
		List<PeInfo> peList = new LinkedList<PeInfo>();
		
		for(Pe cloudsimPe : list) {
			PeInfo payloadPe = new PeInfo(cloudsimPe);
			peList.add(payloadPe);
		}
		
		return peList;
	}

}
