package com.finmex.omnisuite.service.login;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;

import com.finmex.omisuite.login.client.service.LoginClientService;
import com.finmex.omisuite.login.client.service.impl.LoginClientServiceImpl;
import com.finmex.omnisuite.utils.constantes.login.LoginClavesServicios;
import com.finmex.omnisuite.vo.RespuestaVO;
import com.finmex.omnisuite.vo.UsuarioVO;

@Path(LoginClavesServicios.LOGIN_PATH)
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class LoginService {
	
	private static final Logger LOG = Logger.getLogger(LoginService.class); 
	
	private LoginClientService service;
	
	
	@Path(LoginClavesServicios.VALIDAR_CLAVE_ACCESO)
	@POST
	public Response validarClaveAcceso(final UsuarioVO param) {
		service = new LoginClientServiceImpl();
		UsuarioVO out = service.validarClaveAcceso(param);
		RespuestaVO<UsuarioVO> respuesta = 
				new RespuestaVO<UsuarioVO>(Response.Status.ACCEPTED.getStatusCode(), out);
		
		return Response.ok(new GenericEntity<RespuestaVO<UsuarioVO>>(respuesta){}).build();
	}
	
	@Path(LoginClavesServicios.ASIGNAR_NUEVA_CLAVE_ACCESO)
	@POST
	public Response asignarNuevaClaseAcceso(final UsuarioVO param) {
		service = new LoginClientServiceImpl();
		UsuarioVO out = service.asignarNuevaClaveAcceso(param);
		RespuestaVO<UsuarioVO> respuesta =
				new RespuestaVO<UsuarioVO>(Response.Status.ACCEPTED.getStatusCode(), out);
		return Response.ok(new GenericEntity<RespuestaVO<UsuarioVO>>(respuesta){}).build();
	}
}
