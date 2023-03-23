package com.highschool.config;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(info = @Info(title = "High School Management System", version = "1.0", description = "High School Management System API"))
public class OpenApi30Config {
    
}
