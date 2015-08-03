package com.finmex.omnisuite.service.login;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;

import com.finmex.omisuite.login.client.service.LoginClientService;
import com.finmex.omnisuite.login.vo.ImagenSecretaVO;
import com.finmex.omnisuite.login.vo.RespuestaSecretaVO;
import com.finmex.omnisuite.login.vo.SeguridadVO;
import com.finmex.omnisuite.service.aop.LoggerInterceptor;
import com.finmex.omnisuite.utils.constantes.ConstantesOmnisuite;
import com.finmex.omnisuite.utils.constantes.login.LoginClavesServicios;
import com.finmex.omnisuite.vo.RespuestaVO;
import com.finmex.omnisuite.vo.UsuarioVO;
import com.finmex.omnisuite.vo.UsuarioWrapperVO;

@LoggerInterceptor
@Path(LoginClavesServicios.LOGIN_PATH)
@Produces(ConstantesOmnisuite.APPLICATION_JSON_UTF8)
@Consumes(MediaType.APPLICATION_JSON)
public class LoginService {
	private static final Logger LOG = Logger.getLogger(LoginService.class); 
	
	@Inject
	private LoginClientService service;
	
	@Path(LoginClavesServicios.VALIDAR_USUARIO)
	@POST
	public Response validarUsuario(final UsuarioWrapperVO<SeguridadVO> param) {
		LOG.info(param.getUsuario().getCodigo());
		UsuarioVO out = service.validarUsuario(param.getUsuario(), param.getVo());
		RespuestaVO<UsuarioVO> respuesta = 
				new RespuestaVO<>(Response.Status.ACCEPTED.getStatusCode(),out);
		return Response.ok(new GenericEntity<RespuestaVO<UsuarioVO>>(respuesta){}).build();
	}
	
	@Path(LoginClavesServicios.VALIDAR_CLAVE_ACCESO)
	@POST
	public Response validarClaveAcceso(final UsuarioVO param) {
		UsuarioVO out = service.validarClaveAcceso(param);
		RespuestaVO<UsuarioVO> respuesta = 
				new RespuestaVO<UsuarioVO>(Response.Status.ACCEPTED.getStatusCode(), out);
		
		return Response.ok(new GenericEntity<RespuestaVO<UsuarioVO>>(respuesta){}).build();
	}
	
	@Path(LoginClavesServicios.ASIGNAR_NUEVA_CLAVE_ACCESO)
	@POST
	public Response asignarNuevaClaseAcceso(final UsuarioVO param) {
		UsuarioVO out = service.asignarNuevaClaveAcceso(param);
		RespuestaVO<UsuarioVO> respuesta =
				new RespuestaVO<UsuarioVO>(Response.Status.ACCEPTED.getStatusCode(), out);
		return Response.ok(new GenericEntity<RespuestaVO<UsuarioVO>>(respuesta){}).build();
	}
	
	@Path(LoginClavesServicios.ASIGNAR_RESPUESTA_SECRETA)
	@POST
	public Response asignarRespuestaSecreta(final UsuarioWrapperVO<RespuestaSecretaVO> param) {
		LOG.info(param.getUsuario().getCodigo());
		LOG.info(param.getVo().getIdPregunta());
		LOG.info(param.getVo().getRespuesta());
		LOG.info(param.getVo().getAyuda());
		
		UsuarioVO out = service.asginarRespuestaSecreta(param.getUsuario(), param.getVo());
		RespuestaVO<UsuarioVO> respuesta =
				new RespuestaVO<UsuarioVO>(Response.Status.ACCEPTED.getStatusCode(), out);
		return Response.ok(new GenericEntity<RespuestaVO<UsuarioVO>>(respuesta){}).build();
	}
	
	@Path(LoginClavesServicios.ASIGNAR_IMG_SECRETA)
	@POST
	public Response asignarImagenSecreta(final UsuarioWrapperVO<ImagenSecretaVO> param) {
		LOG.info(param.getUsuario().getCodigo());
		LOG.info(param.getVo().getIdImagen());
		LOG.info(param.getVo().getImagen());
		
		UsuarioVO out = service.asginarImagenSecreta(param.getUsuario(), param.getVo());
		RespuestaVO<UsuarioVO> respuesta =
				new RespuestaVO<UsuarioVO>(Response.Status.ACCEPTED.getStatusCode(), out);
		return Response.ok(new GenericEntity<RespuestaVO<UsuarioVO>>(respuesta){}).build();
	}
}
