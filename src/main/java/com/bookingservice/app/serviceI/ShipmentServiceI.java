package com.bookingservice.app.serviceI;

import java.util.List;

import com.bookingservice.app.entity.ShipmentEntity;

public interface ShipmentServiceI {
	
	ShipmentEntity createShipment(ShipmentEntity shipment);
    ShipmentEntity getShipmentById(Long shipId);
    ShipmentEntity updateShipment(Long shipId, ShipmentEntity updatedShipment);
    boolean deleteShipment(Long shipId);
	List<ShipmentEntity> getAllShipmentData();


}
