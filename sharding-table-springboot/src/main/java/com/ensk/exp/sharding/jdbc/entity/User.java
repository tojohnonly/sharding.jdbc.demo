package com.ensk.exp.sharding.jdbc.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {

	private Long id;

	private String city;
	
	private String name;
	
}
