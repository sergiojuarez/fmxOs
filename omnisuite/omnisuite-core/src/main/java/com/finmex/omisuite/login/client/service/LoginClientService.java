package com.finmex.omisuite.login.client.service;

import java.util.List;

import com.finmex.omnisuite.login.vo.ImagenSecretaVO;
import com.finmex.omnisuite.login.vo.MedioNotificacionVO;
import com.finmex.omnisuite.login.vo.Paperless;
import com.finmex.omnisuite.login.vo.RespuestaSecretaVO;
import com.finmex.omnisuite.login.vo.SeguridadVO;
import com.finmex.omnisuite.login.vo.TerminoCondicionVO;
import com.finmex.omnisuite.vo.ContratoVO;
import com.finmex.omnisuite.vo.UsuarioVO;
import com.finmex.omnisuite.vo.UsuarioWrapperVO;

public interface LoginClientService {
	UsuarioVO validarUsuario(UsuarioVO usuario, SeguridadVO seguridad);
	UsuarioVO validarClaveAcceso(UsuarioVO clave);
	UsuarioVO asignarNuevaClaveAcceso(UsuarioVO nuevo);
	UsuarioVO asginarRespuestaSecreta(UsuarioVO usuario,RespuestaSecretaVO respuesta);
	UsuarioVO asginarImagenSecreta(UsuarioVO usuario, ImagenSecretaVO imagen);
	UsuarioVO activarToken(UsuarioVO usuario);
	UsuarioVO aceptarTerminoCondicion(UsuarioVO usuario, TerminoCondicionVO terminos);
	UsuarioVO asignarMedioNotificacion(UsuarioVO usuario, MedioNotificacionVO medio);
	UsuarioVO asignarAlias(UsuarioVO usuario, List<ContratoVO> contratos);
	UsuarioWrapperVO<Paperless> asignarPaperless(UsuarioVO usuario, List<ContratoVO> contratos);
}
