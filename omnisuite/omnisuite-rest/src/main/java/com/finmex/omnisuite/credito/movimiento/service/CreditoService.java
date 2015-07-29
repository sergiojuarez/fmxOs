package com.finmex.omnisuite.credito.movimiento.service;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;

import com.finmex.omnisuite.corp.vo.RespuestaVO;
import com.finmex.omnisuite.credito.movimiento.client.service.CreditoMovimientosClientService;
import com.finmex.omnisuite.credito.movimientos.vo.MovimientosCreditoVO;
import com.finmex.omnisuite.credito.movimientos.vo.ParametrosVO;
import com.finmex.omnisuite.exceptions.OmnisuiteException;

@RequestScoped
@Path("/credito")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CreditoService {
	private static final Logger LOG = Logger.getLogger(CreditoService.class);
	@Inject
	private CreditoMovimientosClientService movimiento; 
	
	@POST
	@Path("/consulta")
	public Response consultaMovimiento(final ParametrosVO param){
		MovimientosCreditoVO consulta = null;
		try 
		{
			consulta = movimiento.consultarUltimosMovimientos(param);
		} catch (OmnisuiteException|NullPointerException e) {
			final RespuestaVO error =
					new RespuestaVO(Response.Status.SERVICE_UNAVAILABLE.getStatusCode(),
					e.getMessage());
			return Response.serverError().entity(error).build();
		}
		return Response.ok(consulta).build();
	}
}
