package org.example.advice;

import javax.servlet.http.HttpServletRequest;

import org.example.exception.BusinessException;
import org.example.vo.CommonResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import lombok.extern.slf4j.Slf4j;

/**
 * <h2>全局异常捕获处理</h2>
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionAdvice {

    @ExceptionHandler(value = BusinessException.class)
    public CommonResponse<String> handlerBusinessException(
            HttpServletRequest req, Exception ex
    ) {

        CommonResponse<String> response = new CommonResponse<>(
                -1, "business error"
        );
        response.setData(ex.getMessage());
        log.error("commerce service has error: [{}]", ex.getMessage(), ex);
        return response;
    }
}
