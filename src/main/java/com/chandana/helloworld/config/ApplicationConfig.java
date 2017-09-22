package com.chandana.helloworld.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class ApplicationConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(getApiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.chandana.helloworld.controllers"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo getApiInfo() {
        Contact contact = new Contact("莊先生", "http://opendata.epa.gov.tw", "weijan.chuang@epa.gov.tw");
        return new ApiInfoBuilder()
                .title("環保署OpenData")
                .description("行政院環境保護署 環境資源資料開放平台")
                .version("1.0.0")
                .license("政府資料開放授權條款－第1版")
                .licenseUrl("https://data.gov.tw/license")
                .contact(contact)
                .build();
    }
}
