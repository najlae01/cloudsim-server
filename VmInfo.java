package org.cloudbus.cloudsim.examples;

import java.util.List;

import org.cloudbus.cloudsim.Vm;

public class VmInfo {

	/** The VM unique id. */
	public int id;

	/** The user id. */
	public int userId;

	/** A Unique Identifier (UID) for the VM, that is compounded by the user id and VM id. */
	public String uid;

	/** The size the VM image size (the amount of storage it will use, at least initially). */
	public long size;

	/** The MIPS capacity of each VM's PE. */
	public double mips;

	/** The number of PEs required by the VM. */
	public int numberOfPes;

	/** The required ram. */
	public int ram;

	/** The required bw. */
	public long bw;

	/** The Virtual Machine Monitor (VMM) that manages the VM. */
	public String vmm;

	/** Indicates if the VM is in migration process. */
	public boolean inMigration;

	/** The current allocated storage size. */
	public long currentAllocatedSize;

	/** The current allocated ram. */
	public int currentAllocatedRam;

	/** The current allocated bw. */
	public long currentAllocatedBw;

	/** The current allocated mips for each VM's PE. */
	public List<Double> currentAllocatedMips;
	
	public VmInfo(Vm cloudsimVm) {
		this.id = cloudsimVm.getId();
		this.uid = cloudsimVm.getUid();
		this.mips = cloudsimVm.getMips();
		this.numberOfPes = cloudsimVm.getNumberOfPes();
		this.ram = cloudsimVm.getRam();
		this.bw = cloudsimVm.getBw();
		this.vmm = cloudsimVm.getVmm();
		this.inMigration = cloudsimVm.isInMigration();
		this.currentAllocatedSize = cloudsimVm.getCurrentAllocatedSize();
		this.currentAllocatedRam = cloudsimVm.getCurrentAllocatedRam();
		this.currentAllocatedBw = cloudsimVm.getCurrentAllocatedBw();
		this.currentAllocatedMips = cloudsimVm.getCurrentAllocatedMips();
				
	}

}
