package com.finmex.omnisuite.service.credito.movimiento;

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
import com.finmex.omnisuite.client.service.CreditoMovimientosClientService;
import com.finmex.omnisuite.client.service.impl.CreditoMovimientosClientServiceImpl;
import com.finmex.omnisuite.credito.movimientos.vo.MovimientosCreditoVO;
import com.finmex.omnisuite.credito.movimientos.vo.MovimientosVO;
import com.finmex.omnisuite.credito.movimientos.vo.ParametrosVO;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@RequestScoped
@Path("/credito")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class Credito {
	
	@POST
	@Path("/consulta")
	public Response consultaMovimiento(final ParametrosVO param){
		if( param == null) {
			return Response.status(Response.Status.NOT_FOUND).build();
		}
		
		CreditoMovimientosClientService movimiento = new CreditoMovimientosClientServiceImpl();
		MovimientosCredito consulta = movimiento.consultarUltimosMovimientos(param);
		MovimientosCreditoVO listaCredito = new MovimientosCreditoVO();
		listaCredito.setMovimientos(new ArrayList<MovimientosVO>());
		
		for(Movimientos m : consulta.getMovimientos()){
			listaCredito.getMovimientos().add(new MovimientosVO(m));
		}
		
		final Gson json = new GsonBuilder().setDateFormat("dd mm, yyyy hh:MM:ss").create();
		String sjson = json.toJson(listaCredito);
		System.out.println(sjson);
		return Response.ok(sjson, MediaType.APPLICATION_JSON).build();
	}
}
