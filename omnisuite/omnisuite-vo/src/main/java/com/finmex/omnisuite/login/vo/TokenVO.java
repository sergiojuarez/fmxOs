package com.finmex.omnisuite.login.vo;

public class TokenVO {

    private String serie;
    private ActivacionVO activacion;

    /**
     * 
     * @return
     *     The serie
     */
    public String getSerie() {
        return serie;
    }

    /**
     * 
     * @param serie
     *     The serie
     */
    public void setSerie(String serie) {
        this.serie = serie;
    }

    public TokenVO withSerie(String serie) {
        this.serie = serie;
        return this;
    }

    /**
     * 
     * @return
     *     The activacion
     */
    public ActivacionVO getActivacion() {
        return activacion;
    }

    /**
     * 
     * @param activacion
     *     The activacion
     */
    public void setActivacion(ActivacionVO activacion) {
        this.activacion = activacion;
    }

    public TokenVO withActivacion(ActivacionVO activacion) {
        this.activacion = activacion;
        return this;
    }
    
    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
	@Override
	public String toString() {
		return "Token [serie=" + serie + ", activacion=" + activacion + "]";
	}

}
