package com.spring_webflux_sample.springdata;

import com.spring_webflux_sample.springdata.sample.Sample;
import com.spring_webflux_sample.springdata.sample.SampleCrudRepository;
import com.spring_webflux_sample.springdata.sample.SampleReactiveRepository;
import io.github.benas.randombeans.api.EnhancedRandom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.reactive.config.EnableWebFlux;

/**
 * Spring data jpa 참고 : https://spring.io/guides/gs/accessing-data-jpa/
 */
@EnableWebFlux
@EnableJpaRepositories
@SpringBootApplication
public class Application implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	/**
	 * Sample Data 저장
	 */
	@Autowired
	private SampleCrudRepository sampleCrudRepository;

	@Override
	public void run(String... args) {
		for (int i = 0; i < 10; i++) {
			sampleCrudRepository.save(EnhancedRandom.random(Sample.class, "id"));
		}
	}
}
