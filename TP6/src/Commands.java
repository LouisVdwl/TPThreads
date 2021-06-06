import java.util.concurrent.ThreadLocalRandom;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Commands extends ListenerAdapter {
	private static String prefix = "stake";
	@Override
    public void onMessageReceived(MessageReceivedEvent event) {
        System.out.println("We received a message from " +
                event.getAuthor().getName() + ": " +
                event.getMessage().getContentDisplay()
        );
        String cmd = event.getMessage().getContentRaw();
        String[] args = cmd.split(" ");

        if(args[0].equalsIgnoreCase(prefix)) {
        	if (args[1].equals("ping")) {
                event.getChannel().sendMessage("Pong!").queue();
            }
            
            if (args[1].equals("dice")) {
                Integer ret;
                System.out.println(args.length);
                if(args.length == 3) {
                	ret = (int)(Math.random() * Integer.parseInt(args[2])) + 1;
                    
                }else {
                	ret = (int)(Math.random() * 6) + 1;
                }
                event.getChannel().sendMessage("Résultat du dé à " + args[2] + " faces: " + ret).queue();
            }
            
            if(args[1].equals("cat")) {
            	EmbedBuilder res = new EmbedBuilder();
                res.setTitle("Oh un chat !");
                res.setImage(random(("https://cataas.com/c?")));
                event.getChannel().sendMessage(res.build()).queue();
            }
        }
    }
	
	private static String random(String url) {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        return url + random.nextInt() + "=" + random.nextInt();
    }
}
