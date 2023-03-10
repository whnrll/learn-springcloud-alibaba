package org.example.util;

import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.StringUtils;

import lombok.extern.slf4j.Slf4j;
import okhttp3.*;

/**
 * 描述：
 *
 * @author : xutao
 * @date : 2022-10-11 21:42
 */
@Slf4j
public class OkHttpUtils {
    private static final OkHttpClient CLIENT;

    static {
        CLIENT =
            new OkHttpClient.Builder().readTimeout(10, TimeUnit.MINUTES).connectTimeout(10, TimeUnit.MINUTES).build();
    }

    public static Response get(String url, Map<String, String> params, Map<String, String> headers) throws IOException {
        if (StringUtils.isBlank(url)) {
            throw new IllegalArgumentException("url is correct");
        }

        HttpUrl httpUrl = HttpUrl.parse(url);
        if (Objects.isNull(httpUrl)) {
            throw new IllegalArgumentException("url is correct");
        }

        HttpUrl.Builder httpBuilder = httpUrl.newBuilder();
        if (MapUtils.isNotEmpty(params)) {
            params.forEach(httpBuilder::addQueryParameter);
        }

        Request request = new Request.Builder().url(httpBuilder.build()).headers(Headers.of(headers)).get().build();
        return CLIENT.newCall(request).execute();
    }

    public static Response get(String url, Map<String, String> params) throws IOException {
        if (StringUtils.isBlank(url)) {
            throw new IllegalArgumentException("url is correct");
        }

        HttpUrl httpUrl = HttpUrl.parse(url);
        if (Objects.isNull(httpUrl)) {
            throw new IllegalArgumentException("url is correct");
        }

        HttpUrl.Builder httpBuilder = httpUrl.newBuilder();
        if (MapUtils.isNotEmpty(params)) {
            params.forEach(httpBuilder::addQueryParameter);
        }

        Request request = new Request.Builder().url(httpBuilder.build()).get().build();
        return CLIENT.newCall(request).execute();
    }

    public static Response post(String url, Map<String, String> headers, String requestBody) throws Exception {
        Request request = new Request.Builder().url(url).headers(Headers.of(headers))
            .post(RequestBody.create(requestBody, MediaType.parse("application/json; charset=utf-8"))).build();

        return CLIENT.newCall(request).execute();
    }

    public static Response post(String url, Map<String, String> headers, Map<String, String> requestBody)
        throws Exception {
        FormBody body = new FormBody.Builder()

            .add("your_param_1", "your_value_1").add("your_param_2", "your_value_2").build();

        Request request = new Request.Builder().url(url).headers(Headers.of(headers)).post(body).build();

        return CLIENT.newCall(request).execute();
    }

}
