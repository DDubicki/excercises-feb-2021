public class Multithreading {

    public static void main(String[] args) {

    int counter = 0;

    Runnable runnable = () -> counter++;

    Thread thread1 = new Thread(runnable);
    Thread thread2 = new Thread(runnable);
    Thread thread3 = new Thread(runnable);

    thread1.start();
    thread2.start();
    thread3.start();

        System.out.println(counter);

    }
}
