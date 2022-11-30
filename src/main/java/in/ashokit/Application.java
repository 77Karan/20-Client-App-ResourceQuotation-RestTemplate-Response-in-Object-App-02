package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.response.QuoteClient;

@SpringBootApplication
public class Application {

	public static void main(String[] args)
	{
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		QuoteClient qcs = context.getBean(QuoteClient.class);
		System.out.println(qcs.getResponseInObject());
	}

}
