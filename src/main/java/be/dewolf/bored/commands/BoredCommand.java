package be.dewolf.bored.commands;

import be.dewolf.bored.client.ActivityClient;
import org.springframework.shell.command.annotation.Option;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

import static org.springframework.shell.standard.ShellOption.NULL;

@ShellComponent
public class BoredCommand {

    private final ActivityClient activityClient;

    public BoredCommand(ActivityClient activityClient) {
        this.activityClient = activityClient;
    }

    @ShellMethod(key =  "hello", value = "Returns a welcome message")
    public String sayHello() {
        return "Hello, World!";
    }

    @ShellMethod(key = "activity", value = "Returns a random activity to do")
    public String randomActivity(@ShellOption(defaultValue = NULL) String sender) {
        if("laïs".equalsIgnoreCase(sender)) {
            return "Pest iemand";
        }
        return activityClient.getRandom().activity();
    }

}
