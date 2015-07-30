package com.finmex.omnisuite.login.vo;

public class ActivacionVO {

    private String otpUno;
    private String otpDos;

    /**
     * 
     * @return
     *     The otpUno
     */
    public String getOtpUno() {
        return otpUno;
    }

    /**
     * 
     * @param otpUno
     *     The otp_uno
     */
    public void setOtpUno(String otpUno) {
        this.otpUno = otpUno;
    }

    public ActivacionVO withOtpUno(String otpUno) {
        this.otpUno = otpUno;
        return this;
    }

    /**
     * 
     * @return
     *     The otpDos
     */
    public String getOtpDos() {
        return otpDos;
    }

    /**
     * 
     * @param otpDos
     *     The otp_dos
     */
    public void setOtpDos(String otpDos) {
        this.otpDos = otpDos;
    }

    public ActivacionVO withOtpDos(String otpDos) {
        this.otpDos = otpDos;
        return this;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
	@Override
	public String toString() {
		return "Activacion [otpUno=" + otpUno + ", otpDos=" + otpDos + "]";
	}

}
