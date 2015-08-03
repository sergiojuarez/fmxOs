package com.finmex.omnisuite.credito.movimiento.client.service.impl;

import java.net.URL;
import java.util.ArrayList;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.apache.log4j.Logger;

import com.finmex.omnisuite.client.CreditoMovimientos;
import com.finmex.omnisuite.client.CreditoMovimientosSoap;
import com.finmex.omnisuite.client.Movimientos;
import com.finmex.omnisuite.client.MovimientosCredito;
import com.finmex.omnisuite.client.ObjectFactory;
import com.finmex.omnisuite.client.Parametros;
import com.finmex.omnisuite.credito.movimiento.client.service.CreditoMovimientosClientService;
import com.finmex.omnisuite.credito.movimientos.vo.MovimientosCreditoVO;
import com.finmex.omnisuite.credito.movimientos.vo.MovimientosVO;
import com.finmex.omnisuite.credito.movimientos.vo.ParametrosVO;
import com.finmex.omnisuite.excepciones.creditos.CreditosException;

/**
 * Clase que implementa los servicios para el módulo de Créditos.
 * 
 * @author Uriel Sánchez
 * @since 21/08/2015
 */
public class CreditoMovimientosClientServiceImpl implements CreditoMovimientosClientService {
	
	private static final Logger LOG = Logger.getLogger(CreditoMovimientosClientServiceImpl.class);
	
	String wsdlURL = "http://192.168.80.102:8181/cxf/CreditoMovimientos?wsdl";
    String namespace = "http://Mascore/Movimientos";
    String serviceName = "CreditoMovimientos";
    QName serviceQN = new QName(namespace, serviceName);
    Service service;
    
    
	/* (non-Javadoc)
	 * @see com.finmex.omnisuite.credito.movimiento.client.service.CreditoMovimientosClientService#consultarUltimosMovimientos(com.finmex.omnisuite.credito.movimientos.vo.ParametrosVO)
	 */
	public MovimientosCreditoVO consultarUltimosMovimientos(ParametrosVO parametrosVO) throws CreditosException {
		MovimientosCredito movs = null;
		ObjectFactory objectFactory = new ObjectFactory();
		try {
			Parametros parametros = objectFactory.createParametros();
			parametros = parametrosVO.toParametros();
			service = CreditoMovimientos.create(new URL(wsdlURL), serviceQN);
			CreditoMovimientosSoap port = service.getPort(CreditoMovimientosSoap.class);
			movs = port.movimientosArray(parametros);
			MovimientosCreditoVO movsVO = new MovimientosCreditoVO();
			movsVO.setMovimientos(new ArrayList<MovimientosVO>());
			for(Movimientos movimientos : movs.getMovimientos()){
				movsVO.getMovimientos().add(new MovimientosVO(movimientos));
			}
			return movsVO;
		} catch (Exception e) {
			throw new CreditosException("Error al consultar el movimiento de cr�dito", e);
		}
	}
}
