package com.spring_webflux_sample.springdata.sample;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Sample {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String message;

	public Sample(String message) {
		Sample sample = new Sample();
		sample.message = message;
	}

	public static Sample defaultSample() {
		return new Sample();
	}
}
