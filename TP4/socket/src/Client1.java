import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client1 {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("127.0.0.1", 8080);
        PrintWriter pw  = new PrintWriter (s.getOutputStream( ));
        pw.println("ok");
        pw.flush();

        BufferedReader bf = new BufferedReader(new InputStreamReader(s.getInputStream()));
        System.out.println(bf.readLine());
        System.out.println(bf.readLine());
    }
}
