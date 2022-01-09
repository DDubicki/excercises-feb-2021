package multithreading;

public class Multithreading {

    public static void main(String[] args) throws InterruptedException {

        CounterIncrementor counter = new CounterIncrementor();
        Runnable runnable = () -> counter.incrementByMany();

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        Thread thread4 = new Thread(() -> new CounterIncrementor().incrementByMany());
//        Thread thread4 = new Thread(new RudeCounterIncrementor());

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();

        System.out.println(counter.getCounter());
    }
}

