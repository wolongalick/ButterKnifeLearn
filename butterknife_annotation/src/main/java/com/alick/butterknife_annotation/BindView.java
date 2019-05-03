package com.alick.butterknife_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author 崔兴旺
 * @package com.alick.butterknife_annotation
 * @title:
 * @description:
 * @date 2019/5/2 22:55
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.CLASS)
public @interface BindView {
    int value();
}
