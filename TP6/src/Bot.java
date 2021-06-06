import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Bot{
	
	private final static String token = "ODQ0NDk2ODA3NzExMDgwNDg4.YKTQ8A.HpBD5HZYFhNp8c1n8vwmybAb6O8";
    public static void main(String[] args) throws Exception {
    	System.out.println("Démarrage du BOT !");
        JDA jda = JDABuilder.createDefault(token)
        		.addEventListeners(new Commands())
        		.build();
        jda.awaitReady();
    }
    
}