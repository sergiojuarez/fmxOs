package com.finmex.omnisuite.service.creditos;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;

import com.finmex.omnisuite.credito.movimiento.client.service.CreditoMovimientosClientService;
import com.finmex.omnisuite.credito.movimientos.vo.MovimientosCreditoVO;
import com.finmex.omnisuite.credito.movimientos.vo.ParametrosVO;
import com.finmex.omnisuite.service.aop.LoggerInterceptor;
import com.finmex.omnisuite.utils.constantes.ConstantesOmnisuite;
import com.finmex.omnisuite.utils.constantes.creditos.CreditosClavesServicios;
import com.finmex.omnisuite.vo.RespuestaVO;

/**
 * Recurso REST que expone servicios para el módulo de Créditos.
 * 
 * @author Felipe Cruz
 * @author Daniel García
 * @since 27/07/2015
 */
@LoggerInterceptor
@Path(CreditosClavesServicios.CREDITOS_PATH)
@Produces(ConstantesOmnisuite.APPLICATION_JSON_UTF8)
@Consumes(MediaType.APPLICATION_JSON)
public class CreditosService {
	private static final Logger LOG = Logger.getLogger(CreditosService.class);
	
	@Inject
	private CreditoMovimientosClientService creditoMovimientosClientService;

	/***
	 * Consulta los últimos movimientos de cédito que tuvo el cliente. 
	 * 
	 * @param parametrosVO : {@code ParametrosVO}
	 * @return {@code javax.ws.rs.core.Response}
	 */
	@POST
	@Path(CreditosClavesServicios.CONSULTAR_MOVIMIENTOS)
	public Response consultarUltimosMovimientos(final ParametrosVO parametrosVO) {
		MovimientosCreditoVO movimientosCreditoVO = 
				creditoMovimientosClientService.consultarUltimosMovimientos(parametrosVO);

		RespuestaVO<MovimientosCreditoVO> respuestaVO = 
				new RespuestaVO<>(Response.Status.ACCEPTED.getStatusCode(),
				movimientosCreditoVO);

		return Response.ok(new GenericEntity<RespuestaVO<MovimientosCreditoVO>>(respuestaVO) {}).build();
	}
}
