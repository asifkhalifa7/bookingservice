package com.bookingservice.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bookingservice.app.entity.ShipmentEntity;

@Repository
public interface ShipmentRepository extends MongoRepository<ShipmentEntity, Long>{

}
