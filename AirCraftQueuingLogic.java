package com.aircraft.app.AirCraftManagementApp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

public class AirCraftQueuingLogic implements Comparable<AirCraftQueuingLogic >{
	
	int id;
	String type;
	String size;
	
	AirCraftQueuingLogic(int id, String type, String size){
		this.id= id;
		this.type= type;
		this.size= size;
	}
	
	@Autowired
     Receiver receiver;
	
	
	@Override
	public String toString() {
	return "Aeroplane id=" + id + ", type=" + type + ", size=" + size ;
	}
	
	Map<Integer,String> priority= new HashMap<Integer, String>();
	Map<Integer,String> sizePriority= new HashMap<Integer, String>();
	
	public void AirCraftQueuingLogicon(int id, String type, String size) {
		this.id= id;
		this.type= type;
		this.size= size;

		this.priority.put(1, "emergency");
		this.priority.put(2, "vip");
		this.priority.put(3, "passenger");
		this.priority.put(4, "cargo");

		this.sizePriority.put(1, "large");
		this.sizePriority.put(2, "small");
		
		
	}

	@Override
	public int compareTo(AirCraftQueuingLogic aero) {
		int p1=0;
		int p2=0;

		Set<?> s1= this.priority.entrySet();
		Iterator<?> itr1= s1.iterator();
		while(itr1.hasNext()) {
		Map.Entry<Integer, String> m= (Map.Entry<Integer, String>)itr1.next();
		if(m.getValue().equalsIgnoreCase(aero.type)) {
		p2=m.getKey();
		break;
		}
		}

		Set<?> s2= this.priority.entrySet();
		Iterator<?> itr2= s2.iterator();
		while(itr2.hasNext()) {
		Map.Entry<Integer, String> m= (Map.Entry<Integer, String>)itr2.next();
		if(m.getValue().equalsIgnoreCase(this.type)) {
		p1=m.getKey();
		break;
		}
		}

		if(p1 < p2) {
		return +1;
		}
		else if( p1 > p2) {
		// push it to deque queue
			receiver.processMessage(id);
		
		}
		else if(p1 == p2) {
          
		}

		
		return 0;
	}
		
	
	/*public static void main(String[] args) {

		PriorityQueue<AirCraftQueuingLogic> airport= new PriorityQueue<>(5, new PriorityComp());
		airport.offer(new AirCraftQueuingLogic(1, "emergency", "large"));
		airport.offer(new AirCraftQueuingLogic(4, "cargo", "small"));
		airport.offer(new AirCraftQueuingLogic(2, "vip", "small"));
		airport.offer(new AirCraftQueuingLogic(3, "passenger", "large"));		
		
	}*/
}

