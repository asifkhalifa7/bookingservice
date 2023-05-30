package com.bookingservice.app.serviceI;

import java.util.List;

import com.bookingservice.app.entity.ShipmentEntity;

public interface ShipmentService {

	ShipmentEntity createShipment(ShipmentEntity shipment);

	ShipmentEntity getShipmentById(Long shipId);

//	List<ShipmentEntity> getAllShipments();
//
//	ShipmentEntity updateShipment(Long shipId, ShipmentEntity updatedShipment);
//
//	void deleteShipment(Long shipId);

}
