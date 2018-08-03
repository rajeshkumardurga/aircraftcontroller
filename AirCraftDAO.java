package com.aircraft.app.AirCraftManagementApp;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface AirCraftDAO extends CrudRepository<AirCraft, Integer>{

	public void updateByCraftID(String status,long AircraftID);

}
