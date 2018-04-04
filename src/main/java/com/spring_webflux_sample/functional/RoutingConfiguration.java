package com.spring_webflux_sample.functional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.http.MediaType.ALL;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class RoutingConfiguration {
    @Bean
    public RouterFunction<ServerResponse> routerFunction() {
        return route(GET("/hello").and(accept(ALL)), request -> ServerResponse.ok().body(Mono.just("Hello World"), String.class));
    }
}
