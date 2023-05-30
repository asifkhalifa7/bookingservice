package com.bookingservice.app.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "commodity")
public class CommodityEntity {
	
	private String name;
    private String category;
    private String item;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
    
    

}
