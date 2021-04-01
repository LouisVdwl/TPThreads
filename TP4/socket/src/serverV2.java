import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class serverV2 {
    public static void main(String[] args) throws IOException {
        ServerSocket serveur = new ServerSocket(50000);
        while (true) {
            Socket client = serveur.accept();
            new Service(client).start();

        }
    }
}
