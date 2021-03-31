import java.util.Scanner;

public class MainInterrupt {
    public static void main(String[] args) {
        Thread th1 = new Thread(new Interrupt());
        th1.start();

        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        th1.interrupt();
        System.out.println("Fin du programme !");
    }
}
