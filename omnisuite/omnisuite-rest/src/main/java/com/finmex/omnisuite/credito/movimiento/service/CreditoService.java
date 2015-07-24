package com.finmex.omnisuite.credito.movimiento.service;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.finmex.omnisuite.corp.vo.ErrorVO;
import com.finmex.omnisuite.credito.movimiento.client.service.CreditoMovimientosClientService;
import com.finmex.omnisuite.credito.movimientos.vo.MovimientosCreditoVO;
import com.finmex.omnisuite.credito.movimientos.vo.ParametrosVO;
import com.finmex.omnisuite.exceptions.OmnisuiteException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@RequestScoped
@Path("/credito")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CreditoService {
	
	@Inject
	private CreditoMovimientosClientService movimiento; 
	
	@POST
	@Path("/consulta")
	public Response consultaMovimiento(final ParametrosVO param){
		if( param == null) {
			return Response.status(Response.Status.NOT_FOUND).build();
		}
		final Gson json = new GsonBuilder().setDateFormat("dd mm, yyyy hh:MM:ss").create();
		
		MovimientosCreditoVO consulta = null;
		try 
		{
			consulta = movimiento.consultarUltimosMovimientos(param);
		} catch (OmnisuiteException e) {
			final ErrorVO error = new ErrorVO(Response.Status.SERVICE_UNAVAILABLE.getStatusCode(),
					"Se ha generado un error", e.getMessage());
			return Response.serverError().entity(json.toJson(error)).build();
		}
		
		String sjson = json.toJson(consulta);
		System.out.println(sjson);
		return Response.ok(sjson, MediaType.APPLICATION_JSON).build();
	}
}
