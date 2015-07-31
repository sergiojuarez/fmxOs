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
import com.finmex.omnisuite.utils.constantes.ConstantesOmnisuite;
import com.finmex.omnisuite.utils.constantes.creditos.CreditosClavesServicios;
import com.finmex.omnisuite.vo.RespuestaVO;

/**
 * Recurso que expone servicios REST para el módulo de Créditos.
 * 
 * 
 * @author Daniel García
 * @since
 */
@Path(CreditosClavesServicios.CREDITOS_PATH)
@Produces(ConstantesOmnisuite.APPLICATION_JSON_UTF8)
@Consumes(MediaType.APPLICATION_JSON)
public class CreditosService {
	private static final Logger LOG = Logger.getLogger(CreditosService.class);
	
	@Inject
	private CreditoMovimientosClientService creditoMovimientosClientService;

	@POST
	@Path(CreditosClavesServicios.CONSULTAR_MOVIMIENTOS)
	public Response consultarUltimosMovimientos(final ParametrosVO parametrosVO) {
		MovimientosCreditoVO movimientosCreditoVO = creditoMovimientosClientService
				.consultarUltimosMovimientos(parametrosVO);

		RespuestaVO<MovimientosCreditoVO> respuestaVO = 
				new RespuestaVO<>(Response.Status.ACCEPTED.getStatusCode(),
				movimientosCreditoVO);

		return Response.ok(new GenericEntity<RespuestaVO<MovimientosCreditoVO>>(respuestaVO) {}).build();
	}
}