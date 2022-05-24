package br.com.aula.aulademo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

@SpringBootApplication
@EnableFeignClients
public class AulaDemoApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(AulaDemoApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper() { return new ModelMapper(); }

}
