package org.cloudbus.cloudsim.examples;

import org.cloudbus.cloudsim.Cloudlet;

public class CloudletInfo {

    public int cloudletId;

    public long cloudletLength;

    public long cloudletFileSize;

    public long cloudletOutputSize;

    public int numberOfPes;

    public String status;

    public double execStartTime;

    public double finishTime;

	public CloudletInfo(Cloudlet cloudsimCloudlet) {
	    this.cloudletId = cloudsimCloudlet.getCloudletId();

	    this.cloudletLength = cloudsimCloudlet.getCloudletLength();

	    this.cloudletFileSize = cloudsimCloudlet.getCloudletFileSize();

	    this.cloudletOutputSize = cloudsimCloudlet.getCloudletOutputSize();

	    this.numberOfPes = cloudsimCloudlet.getNumberOfPes();

	    this.status = getStringStatus(cloudsimCloudlet.getStatus());

	    this.execStartTime = cloudsimCloudlet.getExecStartTime();

	    this.finishTime = cloudsimCloudlet.getFinishTime();
	}
	
	private String getStringStatus(int status) {
		String returnStatus;
		switch(status) {
		case 0: returnStatus = "CREATED";
		  break;
		case 1: returnStatus = "READY";
		  break;
		case 2: returnStatus = "QUEUED";
		  break;
		case 3: returnStatus = "INEXEC";
		  break;
		case 4: returnStatus = "SUCCESS";
		  break;
		case 5: returnStatus = "FAILED";
		  break;
		case 6: returnStatus = "CANCELED";
		  break;
		case 7: returnStatus = "PAUSED";
		  break;
		case 8: returnStatus = "RESUMED";
		  break;
		default: returnStatus  = "UNDEFINED";
          break;
		}
		return returnStatus;
	}

}
