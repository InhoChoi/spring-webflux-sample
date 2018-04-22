package com.spring_webflux_sample.springdata.sample;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SampleCrudRepository extends JpaRepository<Sample, Long> {
}
