package com.libing.exception;

/**
 * @Description:
 * @Auther: LEE
 * @Date: Create in 2018/2/6 23:44
 */
public class EntityException extends RuntimeException {

    private static final long serialVersionUID = 4633000638978165086L;

    public EntityException(String message) {
        super(message);
    }

    public EntityException(String message, Throwable cause) {
        super(message, cause);
    }

}
