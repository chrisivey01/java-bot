package chris.ivey.discordjava;

import net.dv8tion.jda.client.entities.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.security.auth.login.LoginException;

@SpringBootApplication
public class DiscordjavaApplication {
    public static void main(String[] args) throws LoginException {
        SpringApplication.run(DiscordjavaApplication.class, args);
//        login.run();
    }

}
