package br.com.gustavo.currencyquoteapishx;

import br.com.gustavo.currencyquoteapishx.app.core.service.implementation.CurrencyQuoteGatewayServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@SpringBootApplication
@EnableScheduling
public class CurrencyQuoteApiShxApplication {

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {

		return builder
				.rootUri("https://economia.awesomeapi.com.br")
				.setConnectTimeout(Duration.ofMillis(4000))
				.setReadTimeout(Duration.ofMillis(4000))
				.build();
	}

	public static void main(String[] args) {
		SpringApplication.run(CurrencyQuoteApiShxApplication.class, args);
	}

}
