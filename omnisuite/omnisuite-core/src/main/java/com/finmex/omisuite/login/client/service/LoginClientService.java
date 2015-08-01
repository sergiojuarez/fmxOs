package com.finmex.omisuite.login.client.service;

import com.finmex.omnisuite.login.vo.ImagenSecretaVO;
import com.finmex.omnisuite.login.vo.RespuestaSecretaVO;
import com.finmex.omnisuite.login.vo.SeguridadVO;
import com.finmex.omnisuite.vo.UsuarioVO;

public interface LoginClientService {
	UsuarioVO validarUsuario(UsuarioVO usuario, SeguridadVO seguridad);
	UsuarioVO validarClaveAcceso(UsuarioVO clave);
	UsuarioVO asignarNuevaClaveAcceso(UsuarioVO nuevo);
	UsuarioVO asginarRespuestaSecreta(UsuarioVO usuario,RespuestaSecretaVO respuesta);
	UsuarioVO asginarImagenSecreta(UsuarioVO usuario, ImagenSecretaVO imagen);
}
