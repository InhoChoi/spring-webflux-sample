package com.spring_webflux_sample.functional;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Service
public class HelloHandler {
    public Mono<ServerResponse> hello(ServerRequest request) {
        return ServerResponse.ok().syncBody("Hello World");
    }
}
