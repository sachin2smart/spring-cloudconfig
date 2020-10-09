package in.sachinshinde.cloudconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudconfigPuneTollsGitApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudconfigPuneTollsGitApplication.class, args);
	}

}
