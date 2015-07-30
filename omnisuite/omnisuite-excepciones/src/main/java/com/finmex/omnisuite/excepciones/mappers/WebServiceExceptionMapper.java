package com.finmex.omnisuite.excepciones.mappers;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.xml.ws.WebServiceException;

import org.apache.log4j.Logger;

import com.finmex.omnisuite.vo.RespuestaVO;

public class WebServiceExceptionMapper implements ExceptionMapper<WebServiceException> {
	private static final Logger LOG = Logger.getLogger(WebServiceException.class);
	
	@Override
	public Response toResponse(WebServiceException ex) {
		LOG.info(ex.getMessage() + ex.getCause().getMessage());

		final RespuestaVO<String> error =
				new RespuestaVO<>(Response.Status.SERVICE_UNAVAILABLE.getStatusCode(),
				ex.getMessage());
		
		return Response.serverError().entity(error).build();
	}
}
