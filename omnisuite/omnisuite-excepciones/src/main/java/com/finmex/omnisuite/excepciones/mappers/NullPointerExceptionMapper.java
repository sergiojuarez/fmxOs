package com.finmex.omnisuite.excepciones.mappers;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

import org.apache.log4j.Logger;

import com.finmex.omnisuite.vo.RespuestaVO;

public class NullPointerExceptionMapper implements ExceptionMapper<NullPointerException> {
	private static final Logger LOG = Logger.getLogger(NullPointerException.class);
	
	@Override
	public Response toResponse(NullPointerException ex) {
		LOG.info(ex.getMessage() + "\n" + ex.getCause().getMessage());

		final RespuestaVO<String> error =
				new RespuestaVO<>(Response.Status.NOT_FOUND.getStatusCode(),
				ex.getMessage());
		
		return Response.serverError().entity(error).build();
	}
}
