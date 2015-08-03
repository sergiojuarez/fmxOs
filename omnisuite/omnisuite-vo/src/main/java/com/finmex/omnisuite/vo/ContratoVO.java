package com.finmex.omnisuite.vo;

import com.finmex.omnisuite.login.vo.MedioNotificacionVO;

public class ContratoVO {
	private String numero;
	private String alias;
	private Boolean esAceptarPaperless;
	private MedioNotificacionVO medioNotificacion;
	/**
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}
	/**
	 * @return the alias
	 */
	public String getAlias() {
		return alias;
	}
	/**
	 * @param alias the alias to set
	 */
	public void setAlias(String alias) {
		this.alias = alias;
	}
	/**
	 * @return the esAceptarPaperless
	 */
	public Boolean getEsAceptarPaperless() {
		return esAceptarPaperless;
	}
	/**
	 * @param esAceptarPaperless the esAceptarPaperless to set
	 */
	public void setEsAceptarPaperless(Boolean esAceptarPaperless) {
		this.esAceptarPaperless = esAceptarPaperless;
	}
	/**
	 * @return the medioNotificacion
	 */
	public MedioNotificacionVO getMedioNotificacion() {
		return medioNotificacion;
	}
	/**
	 * @param medioNotificacion the medioNotificacion to set
	 */
	public void setMedioNotificacion(MedioNotificacionVO medioNotificacion) {
		this.medioNotificacion = medioNotificacion;
	}
	
	
}
