package com.finmex.omnisuite.excepciones.mappers.login;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.finmex.omnisuite.excepciones.login.LoginException;
import com.finmex.omnisuite.vo.RespuestaVO;

@Provider
public class LoginExceptionMapper implements ExceptionMapper<LoginException> {
	//private static final Logger LOG = Logger.getLogger(LoginService.class);
	
	@Override
	public Response toResponse(LoginException ex) {
		//LOG.info(ex.getMessage() + "\n" + ex.getCause().getMessage());

		final RespuestaVO<String> error =
				new RespuestaVO<>(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(),
				ex.getMessage());
		
		return Response.serverError().entity(error).build();
	}
}
