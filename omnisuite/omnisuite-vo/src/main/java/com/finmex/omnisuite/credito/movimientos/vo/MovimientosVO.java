package com.finmex.omnisuite.credito.movimientos.vo;

import com.finmex.omnisuite.client.Movimientos;

/**
 * 
 * @author ETI2SANI
 *
 */
public class MovimientosVO {
	private String fecha;
	private String folio;
	private String concepto;
	private String monto;
	
	/**
	 * Constructor por defecto
	 */
	public MovimientosVO() {
		super();
	}
	
	/**
	 * 
	 * @param type
	 */
	public MovimientosVO(Movimientos type) {
		super();
		this.fecha = type.getFecha();
		this.folio = type.getFolio();
		this.concepto = type.getConcepto();
		this.monto = type.getMonto();
	}

	/**
	 * @return the fecha
	 */
	public String getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	/**
	 * @return the folio
	 */
	public String getFolio() {
		return folio;
	}

	/**
	 * @param folio the folio to set
	 */
	public void setFolio(String folio) {
		this.folio = folio;
	}

	/**
	 * @return the concepto
	 */
	public String getConcepto() {
		return concepto;
	}

	/**
	 * @param concepto the concepto to set
	 */
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	/**
	 * @return the monto
	 */
	public String getMonto() {
		return monto;
	}

	/**
	 * @param monto the monto to set
	 */
	public void setMonto(String monto) {
		this.monto = monto;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MovimientosVO [fecha=" + fecha + ", folio=" + folio + ", concepto=" + concepto + ", monto=" + monto
				+ "]";
	}
}
