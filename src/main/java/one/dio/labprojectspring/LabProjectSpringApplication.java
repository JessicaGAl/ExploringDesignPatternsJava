package one.dio.labprojectspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Spring( Data JPA; Web; H2 Database; OpenFeign)
 * @author JessicaGAl
 *
 */

@EnableFeignClients
@SpringBootApplication
public class LabProjectSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabProjectSpringApplication.class, args);
	}

}
