package com.erotsx.cloud.common.aop;

import java.lang.annotation.*;

/**
 * @author erotsx
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LogAnnotation {

    String module() default "";

    String operation() default "";
}
