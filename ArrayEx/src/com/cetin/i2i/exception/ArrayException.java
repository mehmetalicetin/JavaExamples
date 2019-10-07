/**
 * 
 */
package com.cetin.i2i.exception;

/**
 * @author mehmetali.cetin
 *
 */
public class ArrayException extends Exception {

	private static final long serialVersionUID = 3257566217748166448L;
	private int excepStatCode;
	private String excepRespCode;
	private String failedElementSubIndex;
	private Exception relatedException;
	private int failedElementLocation = 2;
	private int faultCode;

	/**
	 * Generates the GenericProjectException with the related message and related
	 * root cause
	 *
	 * @param       message- related message
	 * @param cause - root cause
	 */
	public ArrayException(String message, Exception cause) {
		super(message, cause);
		relatedException = cause;
	}

	/**
	 * @param message- related message
	 */
	public ArrayException(String message) {
		super(message);
	}

	public ArrayException(int faultCode, String message, Throwable e) {
		super(message, e);
		this.faultCode = faultCode;
	}

	public ArrayException(int faultCode, String message) {
		super(message);
		this.faultCode = faultCode;
	}

	/**
	 *
	 */
	public ArrayException() {
		super();
	}

	/**
	 * Generates the GenericProjectException with the related message,related
	 * StatusCode and ResponseCode
	 *
	 * @param _excepStatCode -related StatusCode
	 * @param _excepRespCode -relatedResponseCode
	 * @param                message- related message
	 * @see UcapiConstants -for possible values of _excepStatCode and _excepRespCode
	 */
	public ArrayException(int _excepStatCode, String _excepRespCode, String message) {
		super(message);
		this.excepStatCode = _excepStatCode;
		this.excepRespCode = _excepRespCode;
	}

	/**
	 * Generates the GenericProjectException with the related message,related
	 * StatusCode,ResponseCode and related root cause
	 *
	 * @param _excepStatCode -related StatusCode
	 * @param _excepRespCode -relatedResponseCode
	 * @param                message- related message
	 * @param                cause- root cause
	 */
	public ArrayException(int _excepStatCode, String _excepRespCode, String message, Exception cause) {
		super(message);
		this.excepStatCode = _excepStatCode;
		this.excepRespCode = _excepRespCode;
		relatedException = cause;
	}

	/**
	 * Generates the GenericProjectException with the related message,related
	 * StatusCode ResponseCode and failedSubIndex
	 *
	 * @param _excepStatCode         -related StatusCode
	 * @param _excepRespCode         -relatedResponseCode
	 * @param _failedElementSubIndex
	 * @param                        message- related message
	 * @see UcapiConstants -for possible values of _excepStatCode and _excepRespCode
	 */
	public ArrayException(int _excepStatCode, String _excepRespCode, String _failedElementSubIndex, String message) {
		super(message);
		this.excepStatCode = _excepStatCode;
		this.excepRespCode = _excepRespCode;
		this.failedElementSubIndex = _failedElementSubIndex;
	}

	/**
	 * Generates the GenericProjectException with the related message,related
	 * StatusCode,ResponseCode,failedSubIndex and related root cause
	 *
	 * @param _excepStatCode         -related StatusCode
	 * @param _excepRespCode         -relatedResponseCode
	 * @param _failedElementSubIndex
	 * @param                        message- related message
	 * @param                        cause- root cause
	 */
	public ArrayException(int _excepStatCode, String _excepRespCode, String _failedElementSubIndex, String message,
			Exception cause) {
		super(message);
		this.excepStatCode = _excepStatCode;
		this.excepRespCode = _excepRespCode;
		this.failedElementSubIndex = _failedElementSubIndex;
		relatedException = cause;
	}

	public int getExcepStatCode() {
		return excepStatCode;
	}

	public void setExcepStatCode(int excepStatCode) {
		this.excepStatCode = excepStatCode;
	}

	public String getExcepRespCode() {
		return excepRespCode;
	}

	public void setExcepRespCode(String excepRespCode) {
		this.excepRespCode = excepRespCode;
	}

	public String getFailedElementSubIndex() {
		return failedElementSubIndex;
	}

	public void setFailedElementSubIndex(String failedElementSubIndex) {
		this.failedElementSubIndex = failedElementSubIndex;
	}

	public Exception getRelatedException() {
		return relatedException;
	}

	public void setRelatedException(Exception relatedException) {
		this.relatedException = relatedException;
	}

	public int getFailedElementLocation() {
		return failedElementLocation;
	}

	public void setFailedElementLocation(int failedElementLocation) {
		this.failedElementLocation = failedElementLocation;
	}

	public int getFaultCode() {
		return faultCode;
	}

	public void setFaultCode(int faultCode) {
		this.faultCode = faultCode;
	}

}
