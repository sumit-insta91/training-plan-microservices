package com.aggregate.userorder;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.uber.jaeger.Configuration;
import com.uber.jaeger.samplers.ProbabilisticSampler;


/**
 * 
 * @author sumitkumar04
 *
 */
@SpringBootApplication
public class AggregatorServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AggregatorServiceApplication.class, args);
	}

	@Bean
	public RestTemplate geRestTemplate() {
		return new RestTemplate();
	}

	@Bean
	public io.opentracing.Tracer jaegerTracer() {
		return new Configuration("spring-boot", new Configuration.SamplerConfiguration(ProbabilisticSampler.TYPE, 1),
				new Configuration.ReporterConfiguration()).getTracer();
	}
}
