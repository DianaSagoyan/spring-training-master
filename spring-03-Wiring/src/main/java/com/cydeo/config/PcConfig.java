package com.cydeo.config;

import com.cydeo.casefactory.Case;
import com.cydeo.casefactory.DellCase;
import com.cydeo.casefactory.Dimensions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PcConfig {

    @Bean
    public Dimensions dimensions(){
        return new Dimensions(50, 10, 10);
    }

    @Bean
    public Dimensions dimensions2(){
        return new Dimensions(70, 20, 20);
    }

    @Bean
    public Case caseDell(Dimensions dimensions2){  //Has to be the same name as method
        return new DellCase("220B", "Dell", "240", dimensions2);  //Tightly coupled

    }

//    @Bean
//    public Case caseDell(){  //Has to be the same name as method
//        return new DellCase("220B", "Dell", "240", dimensions2());  //Tightly coupled 2nd way
//
//    }
}
