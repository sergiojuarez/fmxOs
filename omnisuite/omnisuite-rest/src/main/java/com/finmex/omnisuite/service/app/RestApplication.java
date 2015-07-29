package com.finmex.omnisuite.service.app;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/finmex")
public class RestApplication extends ResourceConfig {
	
	public RestApplication() {
        packages("com.finmex.omnisuite");
    }
}
