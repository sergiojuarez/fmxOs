package com.finmex.omisuite.login.client.service.impl;

import com.finmex.omisuite.login.client.service.LoginClientService;
import com.finmex.omnisuite.vo.UsuarioVO;

public class LoginClientServiceImpl implements LoginClientService {

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

}
