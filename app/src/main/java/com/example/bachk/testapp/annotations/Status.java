package com.example.bachk.testapp.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by bachk on 1/27/2018.
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Status {
    public enum Priority {LOW, MEDIUM, HIGH}
    Priority priority() default Priority.LOW;
    String author() default "Amit";
    int completion() default 0;
}
