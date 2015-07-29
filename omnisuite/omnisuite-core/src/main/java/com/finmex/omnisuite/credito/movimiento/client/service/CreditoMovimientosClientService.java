package com.finmex.omnisuite.credito.movimiento.client.service;

import com.finmex.omnisuite.credito.movimientos.vo.MovimientosCreditoVO;
import com.finmex.omnisuite.credito.movimientos.vo.ParametrosVO;
import com.finmex.omnisuite.excepciones.creditos.CreditosException;

public interface CreditoMovimientosClientService {
	
	MovimientosCreditoVO consultarUltimosMovimientos(ParametrosVO parametrosVO) throws CreditosException;
}
