package multithreading;

public class RudeCounterIncrementor implements Runnable {

  @Override
  public void run() {
//    for (int i = 0; i < 1000; i++) {
//      log("przed");
////        incrementCounter();
////        incrCounterByThis();
//      incrementCounterBySynchronizer();
//      log("----------------po: " + CounterIncrementor.counter);
//    }
  }

//  private void log(String content) {
//    System.out.println(Thread.currentThread() + " " + content);
//  }
//
//  private void incrementCounterBySynchronizer() {
//      getAnInt();
//  }
//
//  private int getAnInt() {
//
//    int tmp = CounterIncrementor.counter;
//    tmp++;
//    try {
//      Thread.sleep(1);
//    } catch (InterruptedException e) {
//      e.printStackTrace();
//    }
//    CounterIncrementor.counter = tmp;
//
//    return CounterIncrementor.counter;
//  }
}
