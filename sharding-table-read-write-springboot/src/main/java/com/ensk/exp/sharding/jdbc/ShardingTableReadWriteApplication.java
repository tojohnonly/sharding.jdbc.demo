package com.ensk.exp.sharding.jdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShardingTableReadWriteApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShardingTableReadWriteApplication.class, args);
    }
}
