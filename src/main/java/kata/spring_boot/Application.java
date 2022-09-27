package kata.spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);

		String cmd = "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe http://localhost:8080/users";
		Runtime run = Runtime.getRuntime();
		try {
			run.exec(cmd);
		} catch (Exception ignored) {
		}
	}

}
