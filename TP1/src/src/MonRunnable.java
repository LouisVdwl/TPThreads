public class MonRunnable implements Runnable {
    private int compteur;

    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println(Thread.currentThread().getName() + ": " + this.compteur);
            this.compteur ++;
            try {
                Thread.currentThread().sleep((long)(1000 * Math.random()));
            } catch (InterruptedException e) { }

        }
        System.out.println(Thread.currentThread().getName() + ": " + "FIN");
    }
}
