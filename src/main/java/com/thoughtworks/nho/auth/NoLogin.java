package com.thoughtworks.nho.auth;

/**
 * @author : jianbo.wang
 * @date : 2019-04-20  15:36
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 标记为开放方法 即不需要登录的
 */
@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = ElementType.METHOD)
public @interface NoLogin {
}