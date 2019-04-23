package api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@SpringBootApplication
@Configuration("view.ApiModelRepository")
@EnableAutoConfiguration
@ComponentScan({"controller","view"})
public class SpringMvc4Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvc4Application.class, args);
	}

}
