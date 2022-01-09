package multithreading;

import java.util.Objects;

public class CounterIncrementor implements Runnable {

  static int counter;
  static Object free = new Object();

  @Override
  public void run() {
    for (int i = 0; i < 500; i++) {
      log("Before");
//      incrementCounterBySynchronizer();
//      incrementCounterByThis();
      incrementCounter();
      log("After");
    }
  }
  
  private void incrementCounterBySynchronizer() {
    synchronized (free) {
      increment();
    }
  }

  private void incrementCounterByThis() {
    synchronized (this) {
      increment();
    }
  }

  private synchronized void incrementCounter() {
    increment();
  }

  private void increment() {
    int tmpCounter = counter;
    tmpCounter++;
    try {
      Thread.sleep(10);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    counter = tmpCounter;
  }

  private void log(String content) {
    System.out.println(Thread.currentThread() + " " +content);
  }
}

