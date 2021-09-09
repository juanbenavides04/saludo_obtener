package spring.boot.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SaludoObtenerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SaludoObtenerApplication.class, args);
	}

}
