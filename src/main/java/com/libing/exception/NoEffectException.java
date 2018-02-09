package com.libing.exception;

/**
 * @Description:
 * @Auther: LEE
 * @Date: Create in 2018/2/7 0:06
 */
public class NoEffectException extends EntityException {

    private static final long serialVersionUID = 963259286164357585L;

    public NoEffectException(String message) {
        super(message);
    }

    public NoEffectException(String message, Throwable cause) {
        super(message, cause);
    }

}
