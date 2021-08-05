package com.ensk.exp.sharding.jdbc.service;

import java.util.List;

import com.ensk.exp.sharding.jdbc.entity.Location;

public interface LocationService {

    List<Location> list();

    Long addLocation(Location louDong);

}
