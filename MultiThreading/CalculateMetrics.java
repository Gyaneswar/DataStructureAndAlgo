import java.util.Random;

public class CalculateMetrics {
    public static void main(String[] args){
        Metrics metrics = new Metrics();
        BusinessLogic businessLogicThread1 = new BusinessLogic(metrics);
        BusinessLogic businessLogicThread2 = new BusinessLogic(metrics);
        MetricsListener metricsListener = new MetricsListener(metrics);

        businessLogicThread1.start();
        businessLogicThread2.start();
        metricsListener.start();
    }

    private static class BusinessLogic extends Thread{
        Metrics metrics;
        private Random random;
        public BusinessLogic(Metrics metrics){
            this.metrics = metrics;
            random = new Random();
        }
        public void run(){
            while(true){
                long start = System.currentTimeMillis();
                try {
                    Thread.sleep(random.nextInt(10));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                long end = System.currentTimeMillis();
                metrics.addSample(end-start);
            }
        }
    }
    private static class MetricsListener extends Thread{
        Metrics metrics;
        public MetricsListener(Metrics metrics){
            this.metrics = metrics;
        }
        public void run(){
            while(true){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Current average is : "+metrics.getAverage());
            }
        }
    }
    private static class Metrics{
        private double average;
        private long count;
        public Metrics(){
            average = 0.0;
            count = 0;
        }

        public synchronized void addSample(double mills){
            double total = (this.count * this.average) + mills;
            this.count++;
            this.average = total/count;
        }

        public double getAverage(){
            return this.average;
        }

    }
}
