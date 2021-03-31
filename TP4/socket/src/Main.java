import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8080);
        ss.accept();
        Socket s = new Socket("127.0.0.1", 8080);
        PrintWriter pw  = new PrintWriter (s.getOutputStream( ));
        pw.println("ok");
        pw.flush();

        BufferedReader bf = new BufferedReader(new InputStreamReader(s.getInputStream()));
        System.out.println(bf.readLine());
        System.out.println(bf.readLine());


    }
}
