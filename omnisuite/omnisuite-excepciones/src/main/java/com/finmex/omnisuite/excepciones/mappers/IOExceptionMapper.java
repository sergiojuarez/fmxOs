package com.finmex.omnisuite.excepciones.mappers;

import java.io.IOException;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

import org.apache.log4j.Logger;

import com.finmex.omnisuite.vo.RespuestaVO;

public class IOExceptionMapper implements ExceptionMapper<IOException> {
	private static final Logger LOG = Logger.getLogger(IOException.class);
	
	@Override
	public Response toResponse(IOException ex) {
		LOG.info(ex.getMessage());
		
		if (ex.getCause() != null) {
			LOG.info("\n" + ex.getCause().getMessage());
		}

		final RespuestaVO<String> error =
				new RespuestaVO<>(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(),
				ex.getMessage());
		
		return Response.serverError().entity(error).build();
	}
}
