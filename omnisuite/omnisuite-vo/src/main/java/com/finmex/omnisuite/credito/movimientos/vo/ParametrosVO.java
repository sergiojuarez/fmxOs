package com.finmex.omnisuite.credito.movimientos.vo;

import javax.xml.bind.annotation.XmlRootElement;

import com.finmex.omnisuite.client.Parametros;

@XmlRootElement
public class ParametrosVO {
    private Long numCliente;
    private Long folioExpediente;
    
	/**
	 * @return the numCliente
	 */
	public Long getNumCliente() {
		return numCliente;
	}
	/**
	 * @param numCliente the numCliente to set
	 */
	public void setNumCliente(Long numCliente) {
		this.numCliente = numCliente;
	}
	/**
	 * @return the folioExpediente
	 */
	public Long getFolioExpediente() {
		return folioExpediente;
	}
	/**
	 * @param folioExpediente the folioExpediente to set
	 */
	public void setFolioExpediente(Long folioExpediente) {
		this.folioExpediente = folioExpediente;
	}
	
	private static Parametros toParametros(ParametrosVO vo) {
		Parametros parametros = new Parametros();
		parametros.setFolioExpediente(vo.getFolioExpediente() == null ? null : vo.getFolioExpediente().toString());
		parametros.setNumCliente(vo.getNumCliente().toString() == null ? null : vo.getNumCliente().toString());
		return parametros;
	}
    
	public Parametros toParametros() {
		return ParametrosVO.toParametros(this);
	}
}
