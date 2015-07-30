package com.finmex.omnisuite.login.vo;

public class MedioNotificacionVO {

    private String correo;
    private String movil;

    /**
     * 
     * @return
     *     The correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * 
     * @param correo
     *     The correo
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public MedioNotificacionVO withCorreo(String correo) {
        this.correo = correo;
        return this;
    }

    /**
     * 
     * @return
     *     The movil
     */
    public String getMovil() {
        return movil;
    }

    /**
     * 
     * @param movil
     *     The movil
     */
    public void setMovil(String movil) {
        this.movil = movil;
    }

    public MedioNotificacionVO withMovil(String movil) {
        this.movil = movil;
        return this;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
	@Override
	public String toString() {
		return "MedioNotificacion [correo=" + correo + ", movil=" + movil + "]";
	}

}
