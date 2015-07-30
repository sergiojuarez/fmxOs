package com.finmex.omnisuite.login.vo;

/**
 * 
 * @author ETI2SANI
 *
 */
public class TerminoCondicionVO {

    private Boolean esAcepta;
    private String correoEnvio;

    /**
     * 
     * @return
     *     The esAcepta
     */
    public Boolean getEsAcepta() {
        return esAcepta;
    }

    /**
     * 
     * @param esAcepta
     *     The esAcepta
     */
    public void setEsAcepta(Boolean esAcepta) {
        this.esAcepta = esAcepta;
    }

    public TerminoCondicionVO withEsAcepta(Boolean esAcepta) {
        this.esAcepta = esAcepta;
        return this;
    }

    /**
     * 
     * @return
     *     The correoEnvio
     */
    public String getCorreoEnvio() {
        return correoEnvio;
    }

    /**
     * 
     * @param correoEnvio
     *     The correo_envio
     */
    public void setCorreoEnvio(String correoEnvio) {
        this.correoEnvio = correoEnvio;
    }

    public TerminoCondicionVO withCorreoEnvio(String correoEnvio) {
        this.correoEnvio = correoEnvio;
        return this;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
	@Override
	public String toString() {
		return "TerminosCondiciones [esAcepta=" + esAcepta + ", correoEnvio=" + correoEnvio + ", additionalProperties="
				+ "]";
	}

}
