package org.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 描述：Swagger API 接口配置 swagger 访问地址：http://localhost:8080/swagger-ui/index.html
 *
 * @author xutao
 * @Date 2023-02-28 20:17:04
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket docket(Environment environment) {
        // 设置要显示swagger的环境
        Profiles of = Profiles.of("dev", "test");
        // 判断当前是否处于该环境,通过 enable() 接收此参数判断是否要显示
        boolean isShow = environment.acceptsProfiles(of);

        return new Docket(DocumentationType.OAS_30).apiInfo(apiInfo()).groupName("createRestApi") // 配置分组
            // 是否开启 (true 开启 false隐藏。生产环境建议隐藏)
            .enable(isShow)
            // 通过.select()方法，去配置扫描接口
            .select()
            // 扫描的路径包,设置basePackage会将包下的所有被@Api标记类的所有方法作为api
            .apis(RequestHandlerSelectors.basePackage("com.example.springboot.controller"))
            // 指定路径处理,PathSelectors.any()代表所有的路径
            .paths(PathSelectors.any()).build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            // 设置文档标题(API名称)
            .title("SpringBoot中使用Swagger3接口规范")
            // 文档描述
            .description("接口说明")
            // 服务条款URL
            .termsOfServiceUrl("http://localhost:8080/")
            // 版本号
            .version("1.0.0").build();
    }
}
