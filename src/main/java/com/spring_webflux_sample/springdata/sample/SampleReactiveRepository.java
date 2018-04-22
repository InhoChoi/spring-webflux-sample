package com.spring_webflux_sample.springdata.sample;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

@NoRepositoryBean
public interface SampleReactiveRepository extends ReactiveCrudRepository<Sample, Long> {
	/**
	 * spring-data jpa에서는 reactive repository를 제공을 하지 않는다.
	 *
	 * https://stackoverflow.com/questions/43559265/spring-data-commons-2-0-0-no-property-delete-found-for-type-t-reactivecrudrepo
	 * https://github.com/spring-projects/spring-data-examples/issues/241
	 * https://stackoverflow.com/questions/41483194/reactivecrudrepository-to-use-hibernate-in-spring
	 *
	 * Mongo DB, Apache Cassandra and Redis를 먼저 지원을 시작을 한다.
	 */
}
