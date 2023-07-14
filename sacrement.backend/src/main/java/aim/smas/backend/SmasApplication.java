package aim.smas.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"aim.smas.backend", "btr.framework"})
public class SmasApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmasApplication.class, args);
	}

}
