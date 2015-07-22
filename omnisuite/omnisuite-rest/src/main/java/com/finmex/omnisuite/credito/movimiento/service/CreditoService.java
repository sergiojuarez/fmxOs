package com.finmex.omnisuite.credito.movimiento.service;

import java.util.ArrayList;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.finmex.omnisuite.client.Movimientos;
import com.finmex.omnisuite.client.MovimientosCredito;
import com.finmex.omnisuite.corp.vo.ErrorVO;
import com.finmex.omnisuite.credito.movimiento.client.service.CreditoMovimientosClientService;
import com.finmex.omnisuite.credito.movimiento.client.service.impl.CreditoMovimientosClientServiceImpl;
import com.finmex.omnisuite.credito.movimientos.vo.MovimientosCreditoVO;
import com.finmex.omnisuite.credito.movimientos.vo.MovimientosVO;
import com.finmex.omnisuite.credito.movimientos.vo.ParametrosVO;
import com.finmex.omnisuite.exceptions.OmnisuiteException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@RequestScoped
@Path("/credito")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CreditoService {
	
	@POST
	@Path("/consulta")
	public Response consultaMovimiento(final ParametrosVO param){
		if( param == null) {
			return Response.status(Response.Status.NOT_FOUND).build();
		}
		final Gson json = new GsonBuilder().setDateFormat("dd mm, yyyy hh:MM:ss").create();
		CreditoMovimientosClientService movimiento = new CreditoMovimientosClientServiceImpl();
		MovimientosCredito consulta = null;
		try 
		{
			consulta = movimiento.consultarUltimosMovimientos(param);
		} catch (OmnisuiteException e) {
			final ErrorVO error = new ErrorVO(Response.Status.SERVICE_UNAVAILABLE.getStatusCode(),
					"Se ha generado un error", e.getMessage());
			return Response.serverError().entity(json.toJson(error)).build();
		}
		MovimientosCreditoVO listaCredito = new MovimientosCreditoVO();
		listaCredito.setMovimientos(new ArrayList<MovimientosVO>());
		
		for(Movimientos m : consulta.getMovimientos()){
			listaCredito.getMovimientos().add(new MovimientosVO(m));
		}
		
		String sjson = json.toJson(listaCredito);
		System.out.println(sjson);
		return Response.ok(sjson, MediaType.APPLICATION_JSON).build();
	}
}
