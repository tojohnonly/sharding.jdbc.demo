package com.ensk.exp.sharding.jdbc.entity;

import lombok.Data;

@Data
public class Location {

    private Long id;

    private String city;

    private String region;

    private String name;

    private String buildingNum;

    private String unitNum;

}
