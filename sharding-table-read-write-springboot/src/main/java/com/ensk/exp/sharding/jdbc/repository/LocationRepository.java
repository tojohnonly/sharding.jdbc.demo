package com.ensk.exp.sharding.jdbc.repository;

import com.ensk.exp.sharding.jdbc.entity.Location;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LocationRepository {

    Long addLocation(Location louDong);

    List<Location> list();
}
