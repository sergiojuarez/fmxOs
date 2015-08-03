package com.finmex.omisuite.login.client.service.impl;

import java.util.List;

import com.finmex.omisuite.login.client.service.LoginClientService;
import com.finmex.omnisuite.login.vo.ImagenSecretaVO;
import com.finmex.omnisuite.login.vo.MedioNotificacionVO;
import com.finmex.omnisuite.login.vo.Paperless;
import com.finmex.omnisuite.login.vo.RespuestaSecretaVO;
import com.finmex.omnisuite.login.vo.SeguridadVO;
import com.finmex.omnisuite.login.vo.TerminoCondicionVO;
import com.finmex.omnisuite.vo.ContratoVO;
import com.finmex.omnisuite.vo.UsuarioVO;
import com.finmex.omnisuite.vo.UsuarioWrapperVO;

public class LoginClientServiceImpl implements LoginClientService {
	
	@Override
	public UsuarioVO validarUsuario(UsuarioVO usuario, SeguridadVO seguridad) {
		UsuarioVO salida = new UsuarioVO();
		salida.setCodigo("1234567890");
		salida.setNombre("Fulanito Perez");
		salida.setEsActivo(Boolean.TRUE);
		salida.setEsVigente(Boolean.TRUE);
		salida.setEsSesionActiva(Boolean.FALSE);
		return salida;
	}

	@Override
	public UsuarioVO validarClaveAcceso(UsuarioVO clave) {
		UsuarioVO usuario = new UsuarioVO();
		usuario.setCodigo("1234567890");
		usuario.setNombre("Fulanito Perez");
		usuario.setEsActivo(Boolean.TRUE);
		usuario.setEsVigente(Boolean.TRUE);
		usuario.setEsSesionActiva(Boolean.FALSE);
		usuario.setEsPrimerAcceso(Boolean.TRUE);
		usuario.setEsSegundoAcceso(Boolean.FALSE);
		usuario.setEsClaveTemporal(Boolean.TRUE);
		return usuario;
	}

	@Override
	public UsuarioVO asignarNuevaClaveAcceso(UsuarioVO nuevo) {
		UsuarioVO usuario = new UsuarioVO();
		usuario.setCodigo("1234567890");
		usuario.setNombre("Fulanito Perez");
		usuario.setEsActivo(Boolean.TRUE);
		usuario.setEsVigente(Boolean.TRUE);
		usuario.setEsSesionActiva(Boolean.FALSE);
		usuario.setEsPrimerAcceso(Boolean.TRUE);
		usuario.setEsSegundoAcceso(Boolean.FALSE);
		return usuario;
	}
	
	@Override
	public UsuarioVO asginarRespuestaSecreta(UsuarioVO usuario, RespuestaSecretaVO respuesta) {
		UsuarioVO salida = new UsuarioVO();
		salida.setCodigo("1234567890");
		salida.setNombre("Fulanito Perez");
		salida.setEsActivo(Boolean.TRUE);
		salida.setEsVigente(Boolean.TRUE);
		salida.setEsSesionActiva(Boolean.FALSE);
		salida.setEsPrimerAcceso(Boolean.TRUE);
		salida.setEsSegundoAcceso(Boolean.FALSE);
		return salida;
	}
	
	@Override
	public UsuarioVO asginarImagenSecreta(UsuarioVO usuario, ImagenSecretaVO imagen) {
		UsuarioVO salida = new UsuarioVO();
		salida.setCodigo("1234567890");
		salida.setNombre("Fulanito Perez");
		salida.setEsActivo(Boolean.TRUE);
		salida.setEsVigente(Boolean.TRUE);
		salida.setEsSesionActiva(Boolean.FALSE);
		salida.setEsPrimerAcceso(Boolean.TRUE);
		salida.setEsSegundoAcceso(Boolean.FALSE);
		return salida;
	}

	@Override
	public UsuarioVO activarToken(UsuarioVO usuario) {
		UsuarioVO salida = new UsuarioVO();
		salida.setCodigo("1234567890");
		salida.setNombre("Fulanito Perez");
		salida.setEsActivo(Boolean.TRUE);
		salida.setEsVigente(Boolean.TRUE);
		salida.setEsSesionActiva(Boolean.FALSE);
		salida.setEsPrimerAcceso(Boolean.TRUE);
		salida.setEsSegundoAcceso(Boolean.FALSE);
		return salida;
	}

	@Override
	public UsuarioVO aceptarTerminoCondicion(UsuarioVO usuario, TerminoCondicionVO terminos) {
		UsuarioVO salida = new UsuarioVO();
		salida.setCodigo("1234567890");
		salida.setNombre("Fulanito Perez");
		salida.setEsActivo(Boolean.TRUE);
		salida.setEsVigente(Boolean.TRUE);
		salida.setEsSesionActiva(Boolean.FALSE);
		salida.setEsPrimerAcceso(Boolean.TRUE);
		salida.setEsSegundoAcceso(Boolean.FALSE);
		return salida;
	}

	@Override
	public UsuarioVO asignarMedioNotificacion(UsuarioVO usuario, MedioNotificacionVO medio) {
		UsuarioVO salida = new UsuarioVO();
		salida.setCodigo("1234567890");
		salida.setNombre("Fulanito Perez");
		salida.setEsActivo(Boolean.TRUE);
		salida.setEsVigente(Boolean.TRUE);
		salida.setEsSesionActiva(Boolean.FALSE);
		salida.setEsPrimerAcceso(Boolean.TRUE);
		salida.setEsSegundoAcceso(Boolean.FALSE);
		return salida;
	}

	@Override
	public UsuarioVO asignarAlias(UsuarioVO usuario, List<ContratoVO> contratos) {
		UsuarioVO salida = new UsuarioVO();
		salida.setCodigo("1234567890");
		salida.setNombre("Fulanito Perez");
		salida.setEsActivo(Boolean.TRUE);
		salida.setEsVigente(Boolean.TRUE);
		salida.setEsSesionActiva(Boolean.FALSE);
		salida.setEsPrimerAcceso(Boolean.TRUE);
		salida.setEsSegundoAcceso(Boolean.FALSE);
		return salida;
	}

	@Override
	public UsuarioWrapperVO<Paperless> asignarPaperless(UsuarioVO usuario, List<ContratoVO> contratos) {
		UsuarioVO salida = new UsuarioVO();
		salida.setCodigo("1234567890");
		salida.setNombre("Fulanito Perez");
		salida.setEsActivo(Boolean.TRUE);
		salida.setEsVigente(Boolean.TRUE);
		salida.setEsSesionActiva(Boolean.FALSE);
		salida.setEsPrimerAcceso(Boolean.TRUE);
		salida.setEsSegundoAcceso(Boolean.FALSE);
		
		Paperless paper = new Paperless();
		paper.setFolio("45678");
		paper.setFecha("03/08/2015");
		paper.setHora("12:37 P.M.");
		
		UsuarioWrapperVO<Paperless> wrapper = new UsuarioWrapperVO<>();
		wrapper.setUsuario(salida);
		wrapper.setVo(paper);
		
		return wrapper;
	}

}
