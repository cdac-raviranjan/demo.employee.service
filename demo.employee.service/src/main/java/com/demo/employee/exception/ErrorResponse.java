package com.demo.employee.exception;

import java.util.List;


public class ErrorResponse {
	private String errorCode;
	private String errorMessage;
	private List<String> detailMessage;

	public ErrorResponse(String errorCode, String errorMessage, List<String> detailMessage) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.detailMessage = detailMessage;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public List<String> getDetailMessage() {
		return detailMessage;
	}

	public void setDetailMessage(List<String> detailMessage) {
		this.detailMessage = detailMessage;
	}

}
