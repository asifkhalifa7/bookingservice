package com.bookingservice.app.entity;

import java.time.LocalDate;

//
//import javax.persistence.Id;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "shipmententity")
public class ShipmentEntity {
	
	@Id
	private Long shipId;                  
	private Long userId;               
	private String origin;                  
	private String destination;         
	private LocalDate pickupDate;                
	private List<CommodityEntity> commodity;
	private List<StopEntity> stop;
	private List<DimensionEntity> dimensions;
	public Long getShipId() {
		return shipId;
	}
	public void setShipId(Long shipId) {
		this.shipId = shipId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public LocalDate getPickupDate() {
		return pickupDate;
	}
	public void setPickupDate(LocalDate pickupDate) {
		this.pickupDate = pickupDate;
	}
	
	public List<CommodityEntity> getCommodity() {
		return commodity;
	}
	public void setCommodity(List<CommodityEntity> commodity) {
		this.commodity = commodity;
	}
	public List<StopEntity> getStop() {
		return stop;
	}
	public void setStop(List<StopEntity> stop) {
		this.stop = stop;
	}
	public List<DimensionEntity> getDimensions() {
		return dimensions;
	}
	public void setDimensions(List<DimensionEntity> dimensions) {
		this.dimensions = dimensions;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//	private Long shipId;
//	private Long userId;
//	private Long originId;
//	private Long destinationId;
//	private LocalDate pickupDate;
//	private Long commodityId;
//	
//	public Long getShipId() {
//		return shipId;
//	}
//	public void setShipId(Long shipId) {
//		this.shipId = shipId;
//	}
//	public Long getUserId() {
//		return userId;
//	}
//	public void setUserId(Long userId) {
//		this.userId = userId;
//	}
//	public Long getOriginId() {
//		return originId;
//	}
//	public void setOriginId(Long originId) {
//		this.originId = originId;
//	}
//	public Long getDestinationId() {
//		return destinationId;
//	}
//	public void setDestinationId(Long destinationId) {
//		this.destinationId = destinationId;
//	}
//	public LocalDate getPickupDate() {
//		return pickupDate;
//	}
//	public void setPickupDate(LocalDate pickupDate) {
//		this.pickupDate = pickupDate;
//	}
//	public Long getCommodityId() {
//		return commodityId;
//	}
//	public void setCommodityId(Long commodityId) {
//		this.commodityId = commodityId;
//	}
//	
	
	

}
