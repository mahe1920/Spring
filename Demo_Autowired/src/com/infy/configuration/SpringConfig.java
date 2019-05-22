package com.infy.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.mahe.DAO.CustomerLoginDAOImpl;
import com.mahe.Service.CustomerLoginServiceImpl;

@Configuration
@ComponentScan(basePackages= "com.mahe.DAO com.mahe.Service")
public class SpringConfig {
//     @Bean
//     public CustomerLoginServiceImpl customerLoginServiceImpl() {
//          return new CustomerLoginServiceImpl();
//     }
//     @Bean
//     public CustomerLoginDAOImpl customerLoginDAOImpl() {
//          return new CustomerLoginDAOImpl();
//     }
}
