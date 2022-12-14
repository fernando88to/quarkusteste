package com.fernando;

import io.smallrye.common.annotation.RunOnVirtualThread;
import org.jboss.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @Inject
    Logger logger;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        logger.error("foi");
        return "Hello from RESTEasy Reactive";
    }
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/2")
    @RunOnVirtualThread
    public String hello2() {
        logger.error("foi2");
        return "Hello from RESTEasy Reactive";
    }
}