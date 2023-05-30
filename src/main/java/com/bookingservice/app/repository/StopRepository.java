package com.bookingservice.app.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bookingservice.app.entity.StopEntity;

@Repository
public interface StopRepository extends MongoRepository<StopEntity, Long>{
//
//	List<StopEntity> findByShipId(Long shipId);

}
