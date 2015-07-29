package com.finmex.omnisuite.credito.movimientos.vo;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MovimientosCreditoVO {
	private List<MovimientosVO> movimientos;

	/**
	 * @return the movimientos
	 */
	public List<MovimientosVO> getMovimientos() {
		return movimientos;
	}

	/**
	 * @param movimientos the movimientos to set
	 */
	public void setMovimientos(List<MovimientosVO> movimientos) {
		this.movimientos = movimientos;
	}
}
