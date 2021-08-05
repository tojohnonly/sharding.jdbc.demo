package com.ensk.exp.sharding.jdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ensk.exp.sharding.jdbc.entity.Location;
import com.ensk.exp.sharding.jdbc.repository.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService {

    @Autowired
    private LocationRepository locationRepository;

    @Override
    public List<Location> list() {
        return locationRepository.list();
    }

    @Override
    public Long addLocation(Location louDong) {
        return locationRepository.addLocation(louDong);
    }

}
