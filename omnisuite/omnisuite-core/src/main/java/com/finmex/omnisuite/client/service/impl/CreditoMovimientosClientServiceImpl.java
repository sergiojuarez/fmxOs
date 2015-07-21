package com.finmex.omnisuite.client.service.impl;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.finmex.omnisuite.client.CreditoMovimientos;
import com.finmex.omnisuite.client.CreditoMovimientosSoap;
import com.finmex.omnisuite.client.MovimientosCredito;
import com.finmex.omnisuite.client.ObjectFactory;
import com.finmex.omnisuite.client.Parametros;
import com.finmex.omnisuite.client.service.CreditoMovimientosClientService;
import com.finmex.omnisuite.credito.movimientos.vo.ParametrosVO;
import com.finmex.omnisuite.exceptions.OmnisuiteException;

public class CreditoMovimientosClientServiceImpl implements CreditoMovimientosClientService {
	
	String wsdlURL = "http://192.168.80.102:8181/cxf/CreditoMovimientos?wsdl";
    String namespace = "http://Mascore/Movimientos";
    String serviceName = "CreditoMovimientos";
    QName serviceQN = new QName(namespace, serviceName);
    Service service;
	
	public MovimientosCredito consultarUltimosMovimientos(ParametrosVO parametrosVO) throws OmnisuiteException {
		MovimientosCredito movs = null;
		ObjectFactory objectFactory = new ObjectFactory();
		try {
			Parametros parametros = objectFactory.createParametros();
			parametros = parametrosVO.toParametros();
			service = CreditoMovimientos.create(new URL(wsdlURL), serviceQN);
			CreditoMovimientosSoap port = service.getPort(CreditoMovimientosSoap.class);
			movs = port.movimientosArray(parametros);
		} catch (Exception e) {
			throw new OmnisuiteException("Error al consultar el movimiento de crédito", e);
		}
		return movs;
	}
}
