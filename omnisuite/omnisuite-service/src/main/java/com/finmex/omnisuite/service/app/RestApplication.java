package com.finmex.omnisuite.service.app;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

import com.finmex.omnisuite.utils.constantes.ConstantesOmnisuite;

/**
 * Componente que contiene la configuración de la aplicación omnisuite.
 * 
 * @author Daniel García
 * @since 27/07/2015
 */
@ApplicationPath(ConstantesOmnisuite.APPLICATION_PATH)
public class RestApplication extends ResourceConfig {
	/**
	 * Constructor que registra los componentes de configuración de la
	 * aplicación.
	 */
	public RestApplication() {
		packages("com.finmex.omnisuite");
	}
}
