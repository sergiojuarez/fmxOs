package com.finmex.omnisuite.vo;

public class RespuestaVO <T>{
	private Integer codigo;
	private T message;
	
	public RespuestaVO() {
	}

	public RespuestaVO(Integer codigo, T message) {
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
	public T getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(T message) {
		this.message = message;
	}
	
}
