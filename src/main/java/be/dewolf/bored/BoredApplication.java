package be.dewolf.bored;

import be.dewolf.bored.client.ActivityClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@SpringBootApplication
public class BoredApplication {

    public static void main(String[] args) {
        SpringApplication.run(BoredApplication.class, args);
    }

    @Bean
    ActivityClient activityClient() {
        WebClient client = WebClient.builder().baseUrl("https://www.boredapi.com/api").build();
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(WebClientAdapter.create(client)).build();
        return factory.createClient(ActivityClient.class);
    }

}
