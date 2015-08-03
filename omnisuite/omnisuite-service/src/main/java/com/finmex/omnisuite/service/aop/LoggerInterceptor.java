package com.finmex.omnisuite.service.aop;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.ws.rs.NameBinding;

/**
 * Anotación para bitacorizar en log4j el inicio y fin de un recurso REST.
 * 
 * @author Daniel García
 * @since 03/08/2015 
 */
@NameBinding
@Retention(RetentionPolicy.RUNTIME)
@Target({ TYPE, METHOD })
@Documented
public @interface LoggerInterceptor {}
