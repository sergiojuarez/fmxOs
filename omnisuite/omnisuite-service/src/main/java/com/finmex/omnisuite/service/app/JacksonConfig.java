package com.finmex.omnisuite.service.app;

import java.text.SimpleDateFormat;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

/**
 * Configuración de Jackson para la serialización y deserialización.
 * 
 * @author Daniel García
 * @since 29/07/2015
 *
 */
@Provider
@Produces(MediaType.APPLICATION_JSON)
public class JacksonConfig implements ContextResolver<ObjectMapper> {
	private static final String PATRON_FECHAS = "MMM dd, yyyy hh:mm:ss a";

	private final ObjectMapper objectMapper;

	/**
	 * Constructor que realiza las configuraciones correspondientes de
	 * serialización y deserialización.
	 */
	public JacksonConfig() {
		objectMapper = new ObjectMapper();
		objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
		objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		objectMapper.setDateFormat(new SimpleDateFormat(PATRON_FECHAS));
	}

	@Override
	public ObjectMapper getContext(Class<?> arg0) {
		return objectMapper;
	}
}
