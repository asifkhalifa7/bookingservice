package com.bookingservice.app.entity;

//import javax.persistence.Id;
//
//import javax.persistence.JoinColumn;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "dimension")
public class DimensionEntity {
	
	//@Id
	private Long dimensionId;
	private float length;
	private float breadth;
	private float height;
	private float weight;
	private int numberofpices;
	private boolean isStackable;

	
//	@JoinColumn(name = "ship_id")
//    private Long shipId;


	public Long getDimensionId() {
		return dimensionId;
	}


	public void setDimensionId(Long dimensionId) {
		this.dimensionId = dimensionId;
	}


	public float getLength() {
		return length;
	}


	public void setLength(float length) {
		this.length = length;
	}


	public float getBreadth() {
		return breadth;
	}


	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}


	public float getHeight() {
		return height;
	}


	public void setHeight(float height) {
		this.height = height;
	}


	public float getWeight() {
		return weight;
	}


	public void setWeight(float weight) {
		this.weight = weight;
	}


	public int getNumberofpices() {
		return numberofpices;
	}


	public void setNumberofpices(int numberofpices) {
		this.numberofpices = numberofpices;
	}


	public boolean isStackable() {
		return isStackable;
	}


	public void setStackable(boolean isStackable) {
		this.isStackable = isStackable;
	}
//
//
//	public Long getShipId() {
//		return shipId;
//	}
//
//
//	public void setShipId(Long shipId) {
//		this.shipId = shipId;
//	}

}
