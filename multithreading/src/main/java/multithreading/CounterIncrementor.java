package multithreading;

public class CounterIncrementor {

    private int counter;

    public void incrementByMany() {
        for (int i = 0; i < 100; i++) {
            log("before: " + getCounter());
            incrementSynchronized();
            log("after: " + getCounter());
        }
    }

    private void log(String content) {
        System.out.println(Thread.currentThread() + " " + content);
    }

    private synchronized void incrementSynchronized() {
        synchronized (this) {
            increment();
        }
    }

    private void increment() {
        int tmp = counter;
        tmp++;
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        counter = tmp;
    }

    public synchronized int getCounter() {
        return counter;
    }
}

