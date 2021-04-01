import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class Service extends Thread{
    private Socket client;

    public Service(Socket client){
        this.client = client;
    }

    public void run(){
        PrintWriter pw  = null;
        try {
            pw = new PrintWriter(client.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        pw.println("ok");
        pw.flush();

    }
}
