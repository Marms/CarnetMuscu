package fr.df.muscu.seancesvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * https://spring.io/guides/gs/accessing-mongodb-data-rest/
 * @author Florent
 *
 */
@SpringBootApplication
public class SeanceSvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeanceSvcApplication.class, args);
	}
}
