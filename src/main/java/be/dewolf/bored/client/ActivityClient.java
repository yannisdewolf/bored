package be.dewolf.bored.client;

import be.dewolf.bored.model.Activity;
import org.springframework.web.service.annotation.GetExchange;

public interface ActivityClient {

    @GetExchange("/activity")
    Activity getRandom();

}
