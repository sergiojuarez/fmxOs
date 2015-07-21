package com.finmex.omnisuite.service.app;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.finmex.omnisuite.service.credito.movimiento.Credito;

@ApplicationPath("/finmex")
public class RestApplication extends Application 
{
	
	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> set = new HashSet<Class<?>>();
		set.add(Credito.class);
		System.out.println("servicios " + set);
		return set;
	}
}
