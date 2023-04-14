package org.example.util.http;

import lombok.Builder;
import lombok.Data;

import java.util.Map;

@Data
@Builder
public class HttpRequestParam {
    /**
     * 请求地址
     */
    private String url;
    /**
     * 超时设置
     */
    private TimeoutConfig timeoutConfig;
    /**
     * 请求头部
     */
    private Map<String, String> headerMap;
    /**
     * 请求参数
     */
    private Map<String, Object> paramMap;
    /**
     * 重试参数
     */
    private ParentRetryRequestParam retryRequestParam;
    /**
     * 是否已表单形式提交
     */
    private Boolean isForm;
    /**
     * 请求体 json提交
     */
    private Object body;
}
