package com.ittian.work.websocket_api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
@MapperScan("com.ittian.work.websocket_api.mapper")
public class WebsocketApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebsocketApiApplication.class, args);
    }

}
