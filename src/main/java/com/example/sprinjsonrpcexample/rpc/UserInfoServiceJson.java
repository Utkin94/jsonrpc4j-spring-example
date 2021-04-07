package com.example.sprinjsonrpcexample.rpc;

import com.googlecode.jsonrpc4j.JsonRpcMethod;
import org.springframework.stereotype.Component;

@Component
public class UserInfoServiceJson implements JsonRpcService {

    private static final String SERVICE_NAME = "userService";

    @Override
    public String name() {
        return SERVICE_NAME;
    }

    @JsonRpcMethod("getInfo")
    public String getInfo() {
        return "some user info";
    }
}
