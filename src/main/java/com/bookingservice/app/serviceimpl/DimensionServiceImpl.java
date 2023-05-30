package com.bookingservice.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookingservice.app.entity.DimensionEntity;
import com.bookingservice.app.repository.DimensionRepository;
import com.bookingservice.app.serviceI.DimensionService;

@Service
public class DimensionServiceImpl implements DimensionService {
	
	@Autowired
	DimensionRepository dimensionRepository;

//	@Override
//    public DimensionEntity addDimensionToShipment(Long shipId, DimensionEntity dimension) {
//        dimension.setShipId(shipId);
//        return dimensionRepository.save(dimension);
//    }
//
//    @Override
//    public List<DimensionEntity> getDimensionsByShipment(Long shipId) {
//        return dimensionRepository.findByShipId(shipId);
//    }
}
