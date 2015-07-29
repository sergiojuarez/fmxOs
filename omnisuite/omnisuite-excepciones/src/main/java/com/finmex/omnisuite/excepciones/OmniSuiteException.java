/**
 * 
 */
package com.finmex.omnisuite.excepciones;

/**
 * @author Daniel García
 *
 */
public class OmniSuiteException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public OmniSuiteException() {
		super();
	}

	public OmniSuiteException(String message, Throwable cause) {
		super(message, cause);
	}

	public OmniSuiteException(String message) {
		super(message);
	}

}
