package com.cydeo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  //(exclude={AopAutoConfiguration.class}) it will not create beans from that class
public class CydeoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CydeoApplication.class, args);
    }

}
