package com.finmex.omnisuite.excepciones.mappers.creditos;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.apache.log4j.Logger;

import com.finmex.omnisuite.excepciones.creditos.CreditosException;
import com.finmex.omnisuite.vo.RespuestaVO;

@Provider
public class CreditosExceptionMapper implements ExceptionMapper<CreditosException> {
	private static final Logger LOG = Logger.getLogger(CreditosException.class);
	
	@Override
	public Response toResponse(CreditosException ex) {
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
