package org.thymeleaf.spring.support;

import java.lang.annotation.*;

/**
 * From https://github.com/kolorobot/thymeleaf-custom-layout
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Layout {
    String value();
}
