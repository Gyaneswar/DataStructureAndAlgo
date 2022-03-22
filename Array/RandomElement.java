public class RandomElement {
    public static void main(String[] args) {
        int low = 0, high = 10;

        while (true) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            int random = (int) ((Math.random() * (high - low + 1)) + low);
            System.out.println(random);
        }
    }
}
