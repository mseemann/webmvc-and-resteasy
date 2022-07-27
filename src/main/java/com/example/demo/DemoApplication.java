package com.example.demo;

import com.example.demo.resteasy.JaxRSApplication;
import org.jboss.resteasy.plugins.server.servlet.FilterDispatcher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public FilterRegistrationBean<FilterDispatcher> resteasyFilter(){
        FilterRegistrationBean<FilterDispatcher> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new FilterDispatcher());
        registrationBean.addUrlPatterns("/*");
        registrationBean.setOrder(2);
        registrationBean.addInitParameter("javax.ws.rs.Application", JaxRSApplication.class.getName());

        return registrationBean;
    }
}
