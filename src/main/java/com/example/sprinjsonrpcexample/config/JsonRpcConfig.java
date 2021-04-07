package com.example.sprinjsonrpcexample.config;

import com.example.sprinjsonrpcexample.rpc.JsonRpcService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.googlecode.jsonrpc4j.JsonRpcMultiServer;
import com.googlecode.jsonrpc4j.JsonRpcServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class JsonRpcConfig {

    @Bean
    public JsonRpcServer jsonRpcServer(ObjectMapper objectMapper, List<JsonRpcService> services) {
        JsonRpcMultiServer jsonRpcServer = new JsonRpcMultiServer(objectMapper);

        services.forEach(service -> jsonRpcServer.addService(service.name(), service));

        return jsonRpcServer;
    }
}
