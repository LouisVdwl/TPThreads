import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Thread> listeThread = new ArrayList<Thread>();
        int number = Integer.parseInt(args[0]);
        for(int i = 0; i < number; i++){
            Thread t = new Thread(new MonRunnable());
            t.start();
            listeThread.add(t);
        }
        for(Thread t: listeThread){
            t.join();
        }
        System.out.println("FIN des threads");
    }
}
