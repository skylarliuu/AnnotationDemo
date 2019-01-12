package com.skylar.lib_annotation;

import android.support.annotation.IdRes;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Skylar on 2019/1/12
 * Github : https://github.com/skylarliuu
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.FIELD)
public @interface BindView {

    @IdRes  int value();//@IdRes 是 android support library 中的编译时检查注解
}
