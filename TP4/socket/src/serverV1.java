import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class serverV1 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8080);
        Socket client = ss.accept();
        System.out.println("New socket connected");
    }
}
