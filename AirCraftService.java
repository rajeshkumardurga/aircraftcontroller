package com.aircraft.app.AirCraftManagementApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AirCraftService {

	@Autowired
	private AirCraftDAO aircraftdao;
	
	@Autowired
	private AirCraftQueuingLogic aircraftqueue;
	
	@Autowired
	Sender sender;
	
	int aircraftId;
	String aircrafttype;
	String size;
	
	public AirCraft createAirCraft(AirCraft aircraft) {	
		sender.insert(aircraft);
		return aircraftdao.save(aircraft);
		
	}
	public Iterable<AirCraft> getAllAirCrafts() {
		return aircraftdao.findAll();
	}
	public void deleteAirCraft(int aircraftId,String aircrafttype, String aircraftsize) {
		aircraftqueue.AirCraftQueuingLogicon(aircraftId,aircrafttype,aircraftsize);
	}
	
	public void updateStatus(String status, long AircraftID) {	
		aircraftdao.updateByCraftID(status, AircraftID);
	}
	
	 public void priorityQueueLogic(int aircraftId,String aircrafttype,String aircraftsize){
		 this.aircraftId= aircraftId;
		 this.aircrafttype= aircrafttype;
		 this.size= aircraftsize;
	 }
	
}
