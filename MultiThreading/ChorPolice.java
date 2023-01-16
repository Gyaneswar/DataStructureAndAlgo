import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ChorPolice {
    public static final int MAX_PASSWORD=9999;
    public static void main(String[] args) {
        Random random = new Random();
        Vault vault = new Vault(random.nextInt(MAX_PASSWORD));
        List<Thread> threads = new ArrayList<>();
        threads.add(new AscendingThread(vault));
        threads.add(new DescendingThread(vault));
        threads.add(new PoliceThread(vault));

        for(Thread thread : threads){
            thread.start();
        }
    }


    //shared object
    private static class Vault{
        private int password;
        public Vault(int password){
            this.password = password;
        }
        public boolean guessPassword(int guess){
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return this.password == guess;
        }
    }
    private static abstract class HackerThread extends Thread{
        Vault vault;
        public HackerThread(Vault vault){
            this.vault = vault;
        }
        public void start(){
            System.out.println(this.getName()+" Chalu");
            super.start();
        }
    }
    private static class AscendingThread extends HackerThread{

        public AscendingThread(Vault vault) {
            super(vault);
            this.setName("Niche se uparr");
        }
        public void run(){
            for(int guess = 1;guess<=MAX_PASSWORD;guess++){
                if(vault.guessPassword(guess)){
                    System.out.println(this.getName()+" : Paisa wasool HAHAHAHA! , Password was easy : "+guess);
                    System.exit(0);
                }
            }
        }
    }
    private static class DescendingThread extends HackerThread{

        public DescendingThread(Vault vault) {
            super(vault);
            this.setName("Uparr se niche");
        }

        public void run(){
            for(int guess=MAX_PASSWORD;guess >=0;guess--){
                if(vault.guessPassword(guess)){
                    System.out.println(this.getName()+" : Paisa wasool HAHAHAHA! , Password was easy : "+guess);
                    System.exit(0);
                }

            }
        }
    }

    private static class PoliceThread extends Thread{
        private int countDown = 10;
        private Vault vault;
        public PoliceThread(Vault vault){
            this.setName("Police");
            this.vault = vault;
        }

        public void run(){
            for(int time = 1;time < countDown;time++){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(time);
            }
            System.out.println("Game Over ! Kanun ke hath bahut lambe hote he beta");
            System.exit(0);
        }
    }
}
