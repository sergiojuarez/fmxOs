package com.finmex.omnisuite.vo;

import com.finmex.omnisuite.login.vo.TokenVO;

public class UsuarioVO {

    private String codigo;
    private String nombre;
    private Boolean esActivo;
    private Boolean esVigente;
    private Boolean esSesionActiva;
    private Boolean esPrimerAcceso;
    private Boolean esSegundoAcceso;
    private Boolean esClaveTemporal;
    private TokenVO token;

    /**
     * 
     * @return
     *     The codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * 
     * @param codigo
     *     The codigo
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public UsuarioVO withCodigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    /**
     * 
     * @return
     *     The nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * 
     * @param nombre
     *     The nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public UsuarioVO withNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    /**
     * 
     * @return
     *     The esActivo
     */
    public Boolean getEsActivo() {
        return esActivo;
    }

    /**
     * 
     * @param esActivo
     *     The esActivo
     */
    public void setEsActivo(Boolean esActivo) {
        this.esActivo = esActivo;
    }

    public UsuarioVO withEsActivo(Boolean esActivo) {
        this.esActivo = esActivo;
        return this;
    }

    /**
     * 
     * @return
     *     The esVigente
     */
    public Boolean getEsVigente() {
        return esVigente;
    }

    /**
     * 
     * @param esVigente
     *     The esVigente
     */
    public void setEsVigente(Boolean esVigente) {
        this.esVigente = esVigente;
    }

    public UsuarioVO withEsVigente(Boolean esVigente) {
        this.esVigente = esVigente;
        return this;
    }

    /**
     * 
     * @return
     *     The esSesionActiva
     */
    public Boolean getEsSesionActiva() {
        return esSesionActiva;
    }

    /**
     * 
     * @param esSesionActiva
     *     The esSesionActiva
     */
    public void setEsSesionActiva(Boolean esSesionActiva) {
        this.esSesionActiva = esSesionActiva;
    }

    public UsuarioVO withEsSesionActiva(Boolean esSesionActiva) {
        this.esSesionActiva = esSesionActiva;
        return this;
    }

    /**
     * 
     * @return
     *     The esPrimerAcceso
     */
    public Boolean getEsPrimerAcceso() {
        return esPrimerAcceso;
    }

    /**
     * 
     * @param esPrimerAcceso
     *     The esPrimerAcceso
     */
    public void setEsPrimerAcceso(Boolean esPrimerAcceso) {
        this.esPrimerAcceso = esPrimerAcceso;
    }

    public UsuarioVO withEsPrimerAcceso(Boolean esPrimerAcceso) {
        this.esPrimerAcceso = esPrimerAcceso;
        return this;
    }

    /**
     * 
     * @return
     *     The esSegundoAcceso
     */
    public Boolean getEsSegundoAcceso() {
        return esSegundoAcceso;
    }

    /**
     * 
     * @param esSegundoAcceso
     *     The esSegundoAcceso
     */
    public void setEsSegundoAcceso(Boolean esSegundoAcceso) {
        this.esSegundoAcceso = esSegundoAcceso;
    }

    public UsuarioVO withEsSegundoAcceso(Boolean esSegundoAcceso) {
        this.esSegundoAcceso = esSegundoAcceso;
        return this;
    }

    /**
     * 
     * @return
     *     The esClaveTemporal
     */
    public Boolean getEsClaveTemporal() {
        return esClaveTemporal;
    }

    /**
     * 
     * @param esClaveTemporal
     *     The esClaveTemporal
     */
    public void setEsClaveTemporal(Boolean esClaveTemporal) {
        this.esClaveTemporal = esClaveTemporal;
    }

    public UsuarioVO withEsClaveTemporal(Boolean esClaveTemporal) {
        this.esClaveTemporal = esClaveTemporal;
        return this;
    }

    /**
     * 
     * @return
     *     The token
     */
    public TokenVO getToken() {
        return token;
    }

    /**
     * 
     * @param token
     *     The token
     */
    public void setToken(TokenVO token) {
        this.token = token;
    }

    public UsuarioVO withToken(TokenVO token) {
        this.token = token;
        return this;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
	@Override
	public String toString() {
		return "UsuarioVO [codigo=" + codigo + ", nombre=" + nombre + ", esActivo=" + esActivo + ", esVigente="
				+ esVigente + ", esSesionActiva=" + esSesionActiva + ", esPrimerAcceso=" + esPrimerAcceso
				+ ", esSegundoAcceso=" + esSegundoAcceso + ", esClaveTemporal=" + esClaveTemporal + ", token=" + token
				+ "]";
	}

}
