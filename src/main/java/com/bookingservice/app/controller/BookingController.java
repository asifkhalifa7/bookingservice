package com.bookingservice.app.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookingservice.app.entity.ShipmentEntity;
import com.bookingservice.app.exception.ShipmentIdNotFoundException;
import com.bookingservice.app.serviceI.ShipmentServiceI;

@RestController
@RequestMapping("/api")
public class BookingController {
	
//	@Autowired
//	DimensionService dimensionService;
	
//	@Autowired
//	ShipmentService shipmentService;
//	
//	
	
	
	@Autowired
	ShipmentServiceI shipmentServiceI;
	
	
	 @PostMapping("/saveservice")
	    public ResponseEntity<ShipmentEntity> createShipment(@RequestBody ShipmentEntity shipmentEntity) {
	        ShipmentEntity createdShipment = shipmentServiceI.createShipment(shipmentEntity);
	        return ResponseEntity.status(HttpStatus.CREATED).body(createdShipment);
	    }
	 


	 	@GetMapping("/{shipId}")
	    public ResponseEntity<?> getShipmentEntity(@PathVariable("shipId") Long shipId) {
	        try {
	            ShipmentEntity shipment = shipmentServiceI.getShipmentById(shipId);
	            return ResponseEntity.ok(shipment); 
	        } catch (ShipmentIdNotFoundException e) { 
	            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Shipment not found with ID: " + shipId);
	        }
	    }
	 
	 	@GetMapping("/getall")
	    public List<ShipmentEntity> getAllData() {
	       return shipmentServiceI.getAllShipmentData();
	    }

	    @PutMapping("/update/{shipId}")
	    public ResponseEntity<ShipmentEntity> updateShipment(@PathVariable("shipId") Long shipId, @RequestBody ShipmentEntity updatedShipment) {
	        ShipmentEntity shipmentEntity = shipmentServiceI.updateShipment(shipId, updatedShipment);
	        return ResponseEntity.ok(shipmentEntity);
	    }

//	    @DeleteMapping("/delete/{shipId}") //use post instead delete 
//	    public ResponseEntity<Void> deleteShipment(@PathVariable("shipId") Long shipId) {
//	        shipmentServiceI.deleteShipment(shipId);
//	        return ResponseEntity.noContent().build();
//	    }

	    @PostMapping("/delete/{shipId}")
	    public ResponseEntity<String> deleteData(@PathVariable("shipId") Long shipId) {
	        boolean deleted = shipmentServiceI.deleteShipment(shipId);
	        
	        if (deleted) {
	            return ResponseEntity.ok("Data deleted successfully");
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }
	 
} 
	 
	 
	 
	 
	 
//@GetMapping("/getshipment/{shipId}")
//public ResponseEntity<ShipmentEntity> getShipmentEntity(@PathVariable Long ShipId)
//{
//	 ShipmentEntity shipmentEntity=shipmentServiceI.getShipmentById(ShipId);
//	 if(shipmentEntity!=null) {
//		 return new ResponseEntity<ShipmentEntity>(shipmentEntity,HttpStatus.OK);
//	 }
//	 else {
//		 return new ResponseEntity<ShipmentEntity>(HttpStatus.NOT_FOUND);
//	 }
//}

	 
	 
	 
	 

//	 @GetMapping("/{shipId}")
//	    public ResponseEntity<?> getShipmentEntity(@PathVariable("shipId") Long shipId) {
//	        try {
//	            ShipmentEntity shipment = shipmentServiceI.getShipmentById(shipId);
//	            return ResponseEntity.ok(shipment); //send id also
//	        } catch (RuntimeException e) { //change with id not found instead of runtime exc
//	            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Shipment not found with ID: " + shipId);
//	        }
//	    }
	 
	 
	 
//	 @GetMapping("/{shipId}")
//	 public ResponseEntity<?> getShipmentEntity(@PathVariable("shipId") Long shipId) {
//	     try {
//	         ShipmentEntity shipment = shipmentServiceI.getShipmentById(shipId);
//	         if (shipment != null) {
//	             return ResponseEntity.ok("Shipment found with ID: " + shipId + ", Data: " + shipment);
//	         } else {
//	             return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Shipment not found with ID: " + shipId);
//	         }
//	     } catch (ShipmentIdNotFoundException e) {
//	         return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Shipment not found with ID: " + shipId);
//	     }
//	 }
	 
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@Autowired
//	StopService stopService;
	
//	@PostMapping("/saveshipment")
//    public ResponseEntity<ShipmentEntity> createShipment(@RequestBody ShipmentEntity shipment) {
//        ShipmentEntity createdShipment = shipmentService.createShipment(shipment);
//        return ResponseEntity.status(HttpStatus.CREATED).body(createdShipment);
//    }

//    @PostMapping("/{shipId}/addstops")
//    public ResponseEntity<StopEntity> addStopToShipment(@PathVariable("shipId") Long shipId, @RequestBody StopEntity stop) {
//        StopEntity addedStop = stopService.addStopToShipment(shipId, stop);
//        return ResponseEntity.status(HttpStatus.CREATED).body(addedStop);
//    }
//
//    @PostMapping("/{shipId}/adddimensions")
//    public ResponseEntity<DimensionEntity> addDimensionToShipment(@PathVariable("shipId") Long shipId,
//                                                             @RequestBody DimensionEntity dimension) {
//        DimensionEntity addedDimension = dimensionService.addDimensionToShipment(shipId, dimension);
//        return ResponseEntity.status(HttpStatus.CREATED).body(addedDimension);
//    }
//
//    @GetMapping("/getshipment/{shipId}")
//    public ResponseEntity<ShipmentEntity> getShipment(@PathVariable("shipId") Long shipId) {
//        ShipmentEntity shipment = shipmentService.getShipmentById(shipId);
//        return ResponseEntity.ok(shipment);
//    }
//
//    @GetMapping("/{shipId}/getstops")
//    public ResponseEntity<List<StopEntity>> getStopsByShipment(@PathVariable("shipId") Long shipId) {
//        List<StopEntity> stops = stopService.getStopsByShipment(shipId);
//        return ResponseEntity.ok(stops);
//    }
//
//    @GetMapping("/{shipId}/getdimensions")
//    public ResponseEntity<List<DimensionEntity>> getDimensionsByShipment(@PathVariable("shipId") Long shipId) {
//        List<DimensionEntity> dimensions = dimensionService.getDimensionsByShipment(shipId);
//        return ResponseEntity.ok(dimensions);
//    }
//
//    @GetMapping("/getall")
//    public ResponseEntity<List<ShipmentEntity>> getAllShipments() {
//        List<ShipmentEntity> shipments = shipmentService.getAllShipments();
//        return ResponseEntity.ok(shipments);
//    }
//
//    @PutMapping("/update/{shipId}")
//    public ResponseEntity<ShipmentEntity> updateShipment(@PathVariable("shipId") Long shipId,
//                                                   @RequestBody ShipmentEntity updatedShipment) {
//        ShipmentEntity updatedShipmentData = shipmentService.updateShipment(shipId, updatedShipment);
//        return ResponseEntity.ok(updatedShipmentData);
//    }
//
//    @DeleteMapping("/{shipId}")
//    public ResponseEntity<Void> deleteShipment(@PathVariable("shipId") Long shipId) {
//        shipmentService.deleteShipment(shipId);
//        return ResponseEntity.noContent().build();
//    }
//	
//	
	

