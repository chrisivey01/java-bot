package chris.ivey.discordjava;

import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class ChatCommands extends ListenerAdapter {


    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        Message message = event.getMessage();
        String content = message.getContentDisplay();

        ApiHandler apiHandler = new ApiHandler();
        if(content.startsWith("!api")){
            String api = content.substring(5);
            apiHandler.process(api);
        }

    }
}
