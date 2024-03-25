package net.northern.wurmmaps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;
import org.thymeleaf.spring6.view.ThymeleafViewResolver;

@SpringBootApplication
@EnableJpaRepositories("net.northern.wurmmaps.Repositories")
public class WurmmapsApplication {


	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}


	public static void main(String[] args) {
		SpringApplication.run(WurmmapsApplication.class, args);
	}

}
