package com.example.demo.resteasy;

import org.springframework.stereotype.Controller;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Controller
@Path("rest-easy")
public class RestEasyController {

    @GET
    @Path("test")
    public Response hello() {
        return Response.ok("Helo rest easy").build();
    }
}
