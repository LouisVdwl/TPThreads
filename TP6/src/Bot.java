import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class Bot{
	
	private final static String token = "ODQ0NDk2ODA3NzExMDgwNDg4.YKTQ8A.R065-usqCMomTIA44mS9Ntq1DsY";
    public static void main(String[] args) throws Exception {
    	System.out.println("Démarrage du BOT !");
        JDA jda = JDABuilder.createDefault(token)
        		.addEventListeners(new Commands())
        		.build();
        jda.awaitReady();
    }
    
}