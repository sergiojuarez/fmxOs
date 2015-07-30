package com.finmex.omisuite.login.client.service;

import com.finmex.omnisuite.vo.UsuarioVO;

public interface LoginClientService {
	UsuarioVO validarClaveAcceso(UsuarioVO clave);
	UsuarioVO asignarNuevaClaveAcceso(UsuarioVO nuevo);
}
