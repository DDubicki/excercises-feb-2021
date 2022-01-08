import static java.lang.Thread.sleep;

public class Multithreading {

    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException {


        Runnable runnable = () -> {
            for (int i = 0; i < 1000; i++) {
                int newCounter = counter;
                newCounter += 1;
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                counter = newCounter;
            }
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println(counter);
        System.out.println(counter);


    }
}
