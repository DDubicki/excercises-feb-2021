package multithreading;

import multithreading.CounterIncrementor;

import static java.lang.Thread.sleep;

public class Multithreading {

    static int counter;
    static boolean free = true;

    public static void main(String[] args) throws InterruptedException {

        Runnable runnable = new CounterIncrementor();

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
    }
}
