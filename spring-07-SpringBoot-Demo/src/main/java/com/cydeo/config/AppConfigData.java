package com.cydeo.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Data
@Configuration
public class AppConfigData {
    @Value("${username}")
    private String username;
    @Value("${password}")
    private String password;
    @Value("${url}")
    private String url;
}
