package com.erotsx.cloud.common.exception;


import com.erotsx.cloud.common.api.ErrorCode;

/**
 * @author erotsx
 */
public class Asserts {

    public static void fail(String msg) {
        throw new ApiException(msg);
    }

    public static void fail(ErrorCode errorCode) {
        throw new ApiException(errorCode);
    }

}
