package chris.ivey.discordjava;

import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.security.auth.login.LoginException;

@Component
public class BotLogin {


    @Value("${bot.token}")
    private String token;

    @Bean
    public void run() throws LoginException {
        JDA build = new JDABuilder(token).build();
    }
}
