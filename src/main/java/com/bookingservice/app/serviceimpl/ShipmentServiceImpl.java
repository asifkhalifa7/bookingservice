package com.bookingservice.app.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookingservice.app.entity.DimensionEntity;
import com.bookingservice.app.entity.ShipmentEntity;
import com.bookingservice.app.exception.ShipmentIdNotFoundException;
import com.bookingservice.app.repository.DimensionRepository;
import com.bookingservice.app.repository.ShipmentRepository;
import com.bookingservice.app.repository.StopRepository;
import com.bookingservice.app.serviceI.ShipmentService;
import com.bookingservice.app.serviceI.ShipmentServiceI;

@Service
public class ShipmentServiceImpl implements ShipmentServiceI{
	
	@Autowired
	ShipmentRepository shipmentRepository;
	@Override
    public ShipmentEntity createShipment(ShipmentEntity shipment) {
        return shipmentRepository.save(shipment);
    }

	@Override
    public ShipmentEntity getShipmentById(Long shipId) {
        Optional<ShipmentEntity> shipmentOptional = shipmentRepository.findById(shipId);
        if (shipmentOptional.isPresent()) {
            return shipmentOptional.get();
        } else {
            throw new ShipmentIdNotFoundException("Shipment not found with ID: " + shipId); //custome exception
        }
    }
	
    @Override
    public ShipmentEntity updateShipment(Long shipId, ShipmentEntity updatedShipment) {
        updatedShipment.setShipId(shipId);
        return shipmentRepository.save(updatedShipment);
    }
    
    @Override
    public boolean deleteShipment(Long shipId) {
        Optional<ShipmentEntity> dataOptional = shipmentRepository.findById(shipId);
        if (dataOptional.isPresent()) {
            ShipmentEntity data = dataOptional.get();
            shipmentRepository.delete(data);
            return true;
        } else {
            return false;
        }
    }

//    @Override
//    public void deleteShipment(Long shipId) {
//        shipmentRepository.deleteById(shipId);
//    }

	@Override
	public List<ShipmentEntity> getAllShipmentData() {
		
		return shipmentRepository.findAll();
	}
	
	
	
//	@Autowired
//	DimensionRepository dimensionRepository;
//	
//	@Autowired
//	StopRepository stopRepository;

//	@Override
//    public ShipmentEntity createShipment(ShipmentEntity shipment) {
//        return shipmentRepository.save(shipment);
//    }
//
//    @Override
//    public ShipmentEntity getShipmentById(Long shipId) {
//        return shipmentRepository.findById(shipId).get();
//    }
//
//    @Override
//    public List<ShipmentEntity> getAllShipments() {
//        return shipmentRepository.findAll();
//    }
//
//    @Override
//    public ShipmentEntity updateShipment(Long shipId, ShipmentEntity updatedShipment) {
//        ShipmentEntity existingShipment = shipmentRepository.findById(shipId).get();
//        existingShipment.setOriginId(updatedShipment.getOriginId());
//        existingShipment.setPickupDate(updatedShipment.getPickupDate());
//
//        return shipmentRepository.save(existingShipment);
//    }
//
//    @Override
//    public void deleteShipment(Long shipId) {
//        ShipmentEntity shipment = shipmentRepository.findById(shipId).get();
//
//        shipmentRepository.delete(shipment);
//    }
//	
//	

}
