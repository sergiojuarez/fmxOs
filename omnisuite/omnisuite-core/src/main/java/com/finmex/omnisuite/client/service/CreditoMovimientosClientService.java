package com.finmex.omnisuite.client.service;

import com.finmex.omnisuite.client.MovimientosCredito;
import com.finmex.omnisuite.credito.movimientos.vo.ParametrosVO;
import com.finmex.omnisuite.exceptions.OmnisuiteException;

public interface CreditoMovimientosClientService {
	
	public MovimientosCredito consultarUltimosMovimientos(ParametrosVO parametrosVO) throws OmnisuiteException;
}
