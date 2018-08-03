package com.aircraft.app.AirCraftManagementApp;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="aircraft")
public class AirCraft {


	@Column(name="aircraft_id")
	private Integer aircraftId;

	@Column(name="aircraft_type",nullable=false)
	private String aircraftType;
	
	@Column(name="aircraft_size")
	private Date aircraftSize;
	
	
	public Integer getAircraftId() {
		return aircraftId;
	}


	public void setAircraftId(Integer aircraftId) {
		this.aircraftId = aircraftId;
	}


	public String getAircraftType() {
		return aircraftType;
	}


	public void setAircraftType(String aircraftType) {
		this.aircraftType = aircraftType;
	}


	public Date getAircraftSize() {
		return aircraftSize;
	}


	public void setAircraftSize(Date aircraftSize) {
		this.aircraftSize = aircraftSize;
	}

	
	@Override
	public String toString() {
		return "AirCraft [aircraftId=" + aircraftId + ", aitcraftType=" + aircraftType + ", aircraftsize=" + aircraftSize
				+ "]";
	}
	
	
}