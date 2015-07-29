package com.finmex.omnisuite.excepciones.login;

import com.finmex.omnisuite.excepciones.OmniSuiteException;

public class LoginException extends OmniSuiteException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LoginException() {
		super();
	}

	public LoginException(String message, Throwable cause) {
		super(message, cause);
	}

	public LoginException(String message) {
		super(message);
	}
}
