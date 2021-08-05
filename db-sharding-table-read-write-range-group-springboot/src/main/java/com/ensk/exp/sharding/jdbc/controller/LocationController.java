package com.ensk.exp.sharding.jdbc.controller;

import com.ensk.exp.sharding.jdbc.entity.Location;
import com.ensk.exp.sharding.jdbc.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping(value = "/location")
public class LocationController {

    @Autowired
    private LocationService locationService;

    @GetMapping("/list")
    public List<Location> list() {
        return locationService.list();
    }

    @PostMapping("/add")
    public String add() {
        for (long i = 0; i < 10; i++) {
            Location location = new Location();
            location.setId(i);
            location.setCity("深圳");
            location.setRegion("宝安");
            location.setName("李四");
            location.setBuildingNum("A");
            location.setUnitNum("2");
            locationService.addLocation(location);
        }
        return "success";
    }

}
