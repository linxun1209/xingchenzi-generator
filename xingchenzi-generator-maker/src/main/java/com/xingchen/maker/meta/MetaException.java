package com.xingchen.maker.meta;

/**
 * @author xingchen
 * @version V1.0
 * @Package com.xingchen.maker.meta
 * @date 2023/12/10 15:55
 */
public class MetaException extends RuntimeException {

    public MetaException(String message) {
        super(message);
    }

    public MetaException(String message, Throwable cause) {
        super(message, cause);
    }
}
