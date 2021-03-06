package com.blobcity.db.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 *
 * @author Karishma
 * @author Sanket Sarang
 * @since 1.0
 * @version 1.0
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Entity {

    public String collection() default "";

    public String ds() default "";
}
