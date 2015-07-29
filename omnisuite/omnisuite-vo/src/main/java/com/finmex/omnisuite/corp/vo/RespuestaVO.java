package com.finmex.omnisuite.corp.vo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RespuestaVO {
	private Integer codigo;
	private String message;
	
	public RespuestaVO() {
	}

	public RespuestaVO(Integer codigo, String message) {
		this.codigo = codigo;
		this.message = message;
	}
	
	/**
	 * @return the codigo
	 */
	public Integer getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
}
