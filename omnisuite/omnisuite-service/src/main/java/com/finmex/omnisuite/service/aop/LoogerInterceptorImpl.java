package com.finmex.omnisuite.service.aop;

import java.io.IOException;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.container.ResourceInfo;
import javax.ws.rs.core.Context;
import javax.ws.rs.ext.Provider;
import javax.ws.rs.ext.ReaderInterceptor;
import javax.ws.rs.ext.ReaderInterceptorContext;
import javax.ws.rs.ext.WriterInterceptor;
import javax.ws.rs.ext.WriterInterceptorContext;

import org.apache.log4j.Logger;

/**
 * Interceptor para bitacorizar en log4j el inicio y fin de un recurso REST.
 * 
 * @author Daniel García
 * @since 03/08/2015 
 */
@Provider
@LoggerInterceptor
public class LoogerInterceptorImpl implements ReaderInterceptor, WriterInterceptor{
	@Context
    private ResourceInfo resourceInfo;
	
	@Override
	public Object aroundReadFrom(ReaderInterceptorContext context) throws IOException, WebApplicationException {
		final Logger LOG = Logger.getLogger(resourceInfo.getResourceClass());
		LOG.info("Inicio ##-> " + resourceInfo.getResourceMethod());
		Object obj = context.proceed();
		return obj;
	}

	@Override
	public void aroundWriteTo(WriterInterceptorContext context) throws IOException, WebApplicationException {
		final Logger LOG = Logger.getLogger(resourceInfo.getResourceClass());
		context.proceed();
		LOG.info("Fin ##-> " + resourceInfo.getResourceMethod());
	}
}
