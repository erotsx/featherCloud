package com.erotsx.cloud.common.exception;

import com.erotsx.cloud.common.api.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = ApiException.class)
    public Result<?> handle(ApiException apiException) {
        if (apiException.getErrorCode() != null) {
            return Result.failed(apiException.getErrorCode());
        }
        return Result.failed(apiException.getMessage());
    }
}
