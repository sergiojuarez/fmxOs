package com.finmex.omisuite.login.client.service.impl;

import com.finmex.omisuite.login.client.service.LoginClientService;
import com.finmex.omnisuite.login.vo.ImagenSecretaVO;
import com.finmex.omnisuite.login.vo.RespuestaSecretaVO;
import com.finmex.omnisuite.login.vo.SeguridadVO;
import com.finmex.omnisuite.vo.UsuarioVO;

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
//		usuario.setEsSegunfoAcceso(Boolean.FALSE);
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
//		usuario.setEsSegunfoAcceso(Boolean.FALSE);
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
//		salida.setEsSegunfoAcceso(Boolean.FALSE);
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
//		salida.setEsSegunfoAcceso(Boolean.FALSE);
		return salida;
	}

}
