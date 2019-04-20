package com.thoughtworks.nho;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : jianbo.wang
 * @date : 2019-04-20  16:28
 */
@ControllerAdvice(annotations = {RestController.class, ResponseBody.class})
@Order(9)
public class GlobalRestExceptionHandler {

    private static final Logger log = LoggerFactory.getLogger(GlobalRestExceptionHandler.class);

    /**
     * 处理所有异常，并按照统一返回格式返回。不改变HTTP STATUS码
     *
     * @param exception 异常
     * @return 转换后的格式信息
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    ResponseMessage handleException(Exception exception) {
        Integer errCode = 500;
        log.error("出现异常:{}", exception.getMessage());

        return ResponseMessage.error(errCode, "系统内部发生异常！请稍后再试！");
    }

}
