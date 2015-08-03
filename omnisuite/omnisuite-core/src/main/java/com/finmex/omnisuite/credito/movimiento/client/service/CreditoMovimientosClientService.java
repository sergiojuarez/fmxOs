package com.finmex.omnisuite.credito.movimiento.client.service;

import com.finmex.omnisuite.credito.movimientos.vo.MovimientosCreditoVO;
import com.finmex.omnisuite.credito.movimientos.vo.ParametrosVO;
import com.finmex.omnisuite.excepciones.creditos.CreditosException;

/**
 * Interfaz que expone los servicios para el módulo de Créditos.
 * 
 * @author Uriel Sánchez
 * @since 21/08/2015
 */
public interface CreditoMovimientosClientService {
	/**
	 * Consulta los últimos movimientos de cédito que tuvo el cliente. 
	 * 
	 * @param parametrosVO : {@code ParametrosVO}
	 * @return {@code MovimientosCreditoVO}
	 * @throws CreditosException
	 */
	MovimientosCreditoVO consultarUltimosMovimientos(ParametrosVO parametrosVO) throws CreditosException;
}
