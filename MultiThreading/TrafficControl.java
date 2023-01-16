//Deadlock lesson
public class TrafficControl {
    public static void main(String[] args) {
        Intersection intersection = new Intersection();
        TrainA trainA = new TrainA(intersection);
        TrainB trainB = new TrainB(intersection);

        trainB.start();
        trainA.start();
    }

    private static class TrainA extends Thread{
        private Intersection intersection;
        public TrainA(Intersection intersection){
            this.intersection = intersection;
        }

        public void run(){
            while (true){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                intersection.takeRoadA();
            }
        }
    }
    private static class TrainB extends Thread{
        private Intersection intersection;
        public TrainB(Intersection intersection){
            this.intersection = intersection;
        }

        public void run(){
            while (true){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                intersection.takeRoadB();
            }
        }
    }

    private static class Intersection{
        private Object roadA = new Object();
        private Object roadB = new Object();
        public void takeRoadA(){
            synchronized (roadA){
                synchronized (roadB){
                    System.out.println("Taking roadB then roadA");
                }
            }
        }
        public void takeRoadB(){
            synchronized (roadA){
                synchronized (roadB){
                    System.out.println("Taking roadA then roadB");
                }
            }
        }
    }
}

/*

Acquire locks in the same sequential manner everywhere to avoid circular wait deadlock problem.
 */
