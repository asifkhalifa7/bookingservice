package com.bookingservice.app.entity;

import java.time.LocalDate;
//
//
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "stops")
public class StopEntity {
	
	//@Id
	private Long stopId;
	private String stopLocation;
	//private LocalDate timeStamp;
	
//	@JoinColumn(name = "ship_id")
//	private Long shipId;

	public Long getStopId() {
		return stopId;
	}

	public void setStopId(Long stopId) {
		this.stopId = stopId;
	}

	public String getStopLocation() {
		return stopLocation;
	}

	public void setStopLocation(String stopLocation) {
		this.stopLocation = stopLocation;
	}

//	public LocalDate getTimeStamp() {
//		return timeStamp;
//	}
//
//	public void setTimeStamp(LocalDate timeStamp) {
//		this.timeStamp = timeStamp;
//	}

//	public Long getShipId() {
//		return shipId;
//	}
//
//	public void setShipId(Long shipId) {
//		this.shipId = shipId;
//	}

}
