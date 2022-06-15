package it.trian.stage.shopcart;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShopcartApplication {
	private static final Logger LOG = (Logger) LoggerFactory.getLogger(Prodotto.class);

	public static void main(String[] args) {
		LOG.info("START");
		SpringApplication.run(ShopcartApplication.class, args);
	}

}
