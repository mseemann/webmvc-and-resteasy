package com.example.demo.resteasy;

import org.springframework.stereotype.Component;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@Component
public class JaxRSApplication extends Application {

    private final Set<Object> singletons = new HashSet<>();

    // TODO read all reeavnt Beans from the BeansFactory?
    public JaxRSApplication() {
        singletons.add(RestEasyController.class);
    }

    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }
}
