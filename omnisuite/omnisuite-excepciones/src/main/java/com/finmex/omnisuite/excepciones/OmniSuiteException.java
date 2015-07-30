/**
 * 
 */
package com.finmex.omnisuite.excepciones;

/**
 * @author Daniel García
 *
 */
public class OmniSuiteException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public OmniSuiteException() {
	}

	public OmniSuiteException(String message, Throwable cause) {
		super(message, cause);
	}

	public OmniSuiteException(String message) {
		super(message);
	}

}
