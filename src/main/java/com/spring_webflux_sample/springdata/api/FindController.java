package com.spring_webflux_sample.springdata.api;

import com.spring_webflux_sample.springdata.sample.Sample;
import com.spring_webflux_sample.springdata.sample.SampleCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FindController {
	private static final Sample DEFAULT_SAMPLE = Sample.defaultSample();

	@Autowired
	private SampleCrudRepository sampleCrudRepository;

	@RequestMapping("/simple")
	@ResponseBody
	public Sample findOne() {
		return sampleCrudRepository.findById(1L)
			.orElse(DEFAULT_SAMPLE);
	}
}
