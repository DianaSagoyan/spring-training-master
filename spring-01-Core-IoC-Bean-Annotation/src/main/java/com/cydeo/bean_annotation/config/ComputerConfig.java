package com.cydeo.bean_annotation.config;

import com.cydeo.bean_annotation.monitorfactory.Monitor;
import com.cydeo.bean_annotation.monitorfactory.SonyMonitor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ComputerConfig {
    @Bean
    public Monitor monitorSony(){
        return new SonyMonitor("25 inch", "Acer", 25);
    }
}
