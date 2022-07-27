package com.example.demo.resteasy;

import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@Component
public class JaxRSApplication extends Application {

    private static final Set<Object> singletons = new HashSet<>();
    public JaxRSApplication(){
        singletons.add(RestEasyController.class);
    }

    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }
}
