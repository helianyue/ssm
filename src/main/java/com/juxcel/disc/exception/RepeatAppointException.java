package com.juxcel.disc.exception;

/**
 * 重复预约异常
 */
public class RepeatAppointException extends RuntimeException {

	public RepeatAppointException(String message) {
		super(message);
	}

	public RepeatAppointException(String message, Throwable cause) {
		super(message, cause);
	}

}
