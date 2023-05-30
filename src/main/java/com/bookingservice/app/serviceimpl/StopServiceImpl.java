package com.bookingservice.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookingservice.app.entity.StopEntity;
import com.bookingservice.app.repository.StopRepository;
import com.bookingservice.app.serviceI.StopService;

@Service
public class StopServiceImpl implements StopService{
	
	@Autowired
	StopRepository stopRepository;
	
//	@Override
//    public StopEntity addStopToShipment(Long shipId, StopEntity stop) {
//        stop.setShipId(shipId);
//        return stopRepository.save(stop);
//    }
//
//    @Override
//    public List<StopEntity> getStopsByShipment(Long shipId) {
//        return stopRepository.findByShipId(shipId);
//    }

}
