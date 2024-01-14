package org.cloudbus.cloudsim.examples;

import java.util.LinkedList;
import java.util.List;

import com.google.gson.Gson; 

import org.cloudbus.cloudsim.Datacenter;
import org.cloudbus.cloudsim.DatacenterBroker;

public class Test {

	public static void main(String[] args) {
		List<Datacenter> datacenterList = new LinkedList<Datacenter>();
		Datacenter datacenter0;
		datacenterList.add(datacenter0);
		Datacenter datacenter1;
		datacenterList.add(datacenter1);
		
		List<DatacenterBroker> brokerList = new LinkedList<DatacenterBroker>();
		DatacenterBroker broker1;
		brokerList.add(broker1);
		DatacenterBroker broker2;
		brokerList.add(broker2);
		
		Gson gson = new Gson();
		get("/", (request, response) -> {
				
			response.type("application/json");
			response.header("Access-Control-Allow-Origin", "*");
			
			return new PayloadContainer(datacenterList, brokerList);
		}, gson::toJson);

	}
}
