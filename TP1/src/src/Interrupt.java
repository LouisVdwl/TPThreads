public class Interrupt implements Runnable{

    private int compteur;

    public Interrupt(){
        this.compteur = 0;
    }

    @Override
    public void run() {
        while(!Thread.currentThread().isInterrupted()){
            Long time;
            time  = System.currentTimeMillis();
            this.compteur ++;

            System.out.println(Thread.currentThread().getName() + " - Compteur : " + this.compteur);

            try{
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                int temps;
                temps = (int) (System.currentTimeMillis()- time);
                System.out.println(Thread.currentThread().getName() + ": Pause de " + temps + " ms !");
                System.out.println("Arrêt du Thread\n");
                Thread.currentThread().interrupt();
            }
        }
    }
}
