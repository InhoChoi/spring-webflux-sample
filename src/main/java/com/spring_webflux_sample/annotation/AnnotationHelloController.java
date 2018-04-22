package com.spring_webflux_sample.annotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.config.EnableWebFlux;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@EnableWebFlux
@EnableAutoConfiguration
public class AnnotationHelloController {

    @RequestMapping("/")
    @ResponseBody
    Mono<String> home() {
        return Mono.just("Hello World");
    }

    public static void main(String[] args) {
        SpringApplication.run(AnnotationHelloController.class, args);
    }
}