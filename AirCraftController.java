package com.aircraft.app.AirCraftManagementApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AirCraftController {
	
	@Autowired
	private AirCraftService airCraftService;
	
	// For enqueing ,creating an aircraft.
	@PostMapping(value="/createaircraft")
	public AirCraft createAirCraft(@RequestBody AirCraft aircraft){
		System.out.println("Entered");
		return airCraftService.createAirCraft(aircraft);
	}
	
	// To get the remaining aircrafts in a queue after the priority one landed.
	@GetMapping(value="/allaircrafts")
	public Iterable<AirCraft> getAllAirCrafts(){
		System.out.println("ot it");
		return airCraftService.getAllAirCrafts();
	}
	
	// for Deque mechanisim, we are deleting from the queue
	@DeleteMapping(value="/deleteaircraft")
	public void deleteAircraft(@PathVariable("aircraftId")int aircraftId,@PathVariable("aircrafttype") String aircrafttype,@PathVariable("aircraftsize") String aircraftsize){
		airCraftService.deleteAirCraft(aircraftId,aircrafttype,aircraftsize);
	}
	
	
}

