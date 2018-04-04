package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.config.EnableWebFlux;
import reactor.core.publisher.Mono;

@RestController
@EnableWebFlux
@EnableAutoConfiguration
public class HelloController {

    @RequestMapping("/")
    @ResponseBody
    Mono<String> home() {
        return Mono.just("Hello World");
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloController.class, args);
    }
}