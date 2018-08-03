package com.aircraft.app.AirCraftManagementApp;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitMessagingTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class Sender {

	RabbitMessagingTemplate template;

	@Autowired
	Sender(RabbitMessagingTemplate template){
		this.template = template;
	}
	@Bean
	Queue queue() {
		//return new Queue("SearchQ", false);
		return new Queue("Enqueue", false);
	}
	@Bean
	Queue queue1() {
	//	return new Queue("CheckINQ", false);
		return new Queue("Dequeue", false);
	}
	
	
	public void send(Object message){
		template.convertAndSend("Dequeue", message);
	}
	
	public void insert(AirCraft message){
		template.convertAndSend("Enqueue", message);
	}

}
