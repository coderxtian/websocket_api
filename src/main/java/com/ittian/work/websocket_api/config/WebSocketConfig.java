package com.ittian.work.websocket_api.config;

/**
 * Created with IntelliJ IDEA.
 * User: zhangtianzhi
 * Date: 2020/2/11
 * Time: 19:02
 * Description:
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * 开启WebSocket支持
 * @author zhengkai.blog.csdn.net
 */
@Configuration
public class WebSocketConfig {

    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }

}
