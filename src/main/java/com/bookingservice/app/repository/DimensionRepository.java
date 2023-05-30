package com.bookingservice.app.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bookingservice.app.entity.DimensionEntity;

@Repository
public interface DimensionRepository extends MongoRepository<DimensionEntity, Long>{

//	List<DimensionEntity> findByShipId(Long shipId);

}
