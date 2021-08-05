package com.ensk.exp.sharding.jdbc.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ensk.exp.sharding.jdbc.entity.Location;

@Mapper
public interface LocationRepository {

    Long addLocation(Location louDong);

    List<Location> list();
}
