package com.aircraft.app.AirCraftManagementApp;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;



public class Receiver {

	
AirCraftService aircraft;
	
	@Autowired
	public Receiver(AirCraftService aircraft){
		this.aircraft = aircraft;
	}
	@RabbitListener(queues = "CheckINQ")
    public void processMessage(int aircraftID ) {
		aircraft.updateStatus(AirCraftStatus.LANDING, aircraftID);
    }
	
}
