package com.finmex.omnisuite.vo;

public class UsuarioWrapperVO<T> {

    private UsuarioVO usuario;
    private T vo;
    
	/**
	 * @return the usuario
	 */
	public UsuarioVO getUsuario() {
		return usuario;
	}
	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(UsuarioVO usuario) {
		this.usuario = usuario;
	}
	/**
	 * @return the vo
	 */
	public T getVo() {
		return vo;
	}
	/**
	 * @param vo the vo to set
	 */
	public void setVo(T vo) {
		this.vo = vo;
	}
    
}
