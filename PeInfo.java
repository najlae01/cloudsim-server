package org.cloudbus.cloudsim.examples;

import org.cloudbus.cloudsim.Pe;

public class PeInfo {
	public int id;
	public int mips;
	public int status;

	public PeInfo(Pe cloudsimPe) {
		this.id = cloudsimPe.getId();
		this.mips = cloudsimPe.getMips();
		this.status = cloudsimPe.getStatus();
	}
}
