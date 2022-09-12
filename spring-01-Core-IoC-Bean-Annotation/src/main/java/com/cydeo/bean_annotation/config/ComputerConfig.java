package com.cydeo.bean_annotation.config;

import com.cydeo.bean_annotation.casefactory.Case;
import com.cydeo.bean_annotation.casefactory.DellCase;
import com.cydeo.bean_annotation.monitorfactory.AcerMonitor;
import com.cydeo.bean_annotation.monitorfactory.Monitor;
import com.cydeo.bean_annotation.monitorfactory.SonyMonitor;
import com.cydeo.bean_annotation.motherboardfactory.AsusMotherboard;
import com.cydeo.bean_annotation.motherboardfactory.Motherboard;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ComputerConfig {
    @Bean(name="sony")
    public Monitor monitorSony(){
        return new SonyMonitor("25 inch", "Sony", 25);
    }
    @Bean
    @Primary //It will take this one if we don't specify which one we want
    public Monitor monitorAcer(){
        return new AcerMonitor("30 inch", "Sony", 25);
    }
    @Bean
    public Case caseDell(){
        return new DellCase("22OB", "Dell", "240");
    }
    @Bean
    public Motherboard motherboardAsus(){
        return new AsusMotherboard("BJ-200", "Asus", 4, 6, "v2.44");
    }

}
