package com.finmex.omnisuite.corp.vo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ErrorVO {
	private Integer status;
	private String message;
	private String details;
	
	public ErrorVO() {}
	
	public ErrorVO(Integer status, String message, String details) {
		this.status = status;
		this.message = message;
		this.details = details;
	}
	
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
}
