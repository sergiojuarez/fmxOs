package com.finmex.omnisuite.excepciones.mappers;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.apache.log4j.Logger;

import com.finmex.omnisuite.excepciones.NotFoundException;
import com.finmex.omnisuite.vo.RespuestaVO;

@Provider
public class NotFoundExceptionMapper implements ExceptionMapper<NotFoundException> {
	private static final Logger LOG = Logger.getLogger(NotFoundException.class);
	
	@Override
	public Response toResponse(NotFoundException ex) {
		LOG.info(ex.getMessage());
		
		if (ex.getCause() != null) {
			LOG.info("\n" + ex.getCause().getMessage());
		}

		final RespuestaVO<String> error =
				new RespuestaVO<>(Response.Status.NOT_FOUND.getStatusCode(),
				ex.getMessage());
		
		return Response.serverError().entity(error).build();
	}
}
