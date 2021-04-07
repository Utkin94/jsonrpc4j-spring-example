package com.example.sprinjsonrpcexample.controller;

import com.googlecode.jsonrpc4j.JsonRpcServer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequestMapping("/json/rpc")
@RequiredArgsConstructor
public class RpcController {

    private final JsonRpcServer jsonRpcServer;

    @PostMapping
    public void postController(HttpServletRequest request, HttpServletResponse response) throws IOException {
        jsonRpcServer.handle(request, response);
    }
}
