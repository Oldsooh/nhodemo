package com.thoughtworks.nho.auth;

import com.thoughtworks.nho.ResponseMessage;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.Objects;


/**
 * @author : jianbo.wang
 * @date : 2019-04-20  15:42
 */
@Component
@Aspect
@Slf4j
public class AuthAspect {
    /**
     * 日志提供器
     */
    private Logger logger= LoggerFactory.getLogger(AuthAspect.class);


    // 定义切点Pointcut
    @Pointcut("@annotation(NoLogin)")
    public void excudeService() {
    }

    @Around("excudeService()")
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
        RequestAttributes ra = RequestContextHolder.getRequestAttributes();
        ServletRequestAttributes sra = (ServletRequestAttributes) ra;
        if (Objects.isNull(sra)){
            return ResponseMessage.error("未知异常！");
        }
        HttpServletRequest request = sra.getRequest();

        String authHeader= request.getHeader("Authorization");
        if (StringUtils.isEmpty(authHeader)){
            return ResponseMessage.error("请登录后再试。");
        }
        String url = request.getRequestURL().toString();
        String method = request.getMethod();
        String uri = request.getRequestURI();
        String queryString = request.getQueryString();
        logger.info("请求开始, 各个参数, url: {}, method: {}, uri: {}, params: {}", url, method, uri, queryString);

        // result的值就是被拦截方法的返回值
        Object result = pjp.proceed();


        return result;
    }
}
