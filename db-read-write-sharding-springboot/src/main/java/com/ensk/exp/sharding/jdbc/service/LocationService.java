package com.ensk.exp.sharding.jdbc.service;

import com.ensk.exp.sharding.jdbc.entity.Location;
import java.util.List;

public interface LocationService {

    List<Location> list();

    Long addLocation(Location louDong);

}
