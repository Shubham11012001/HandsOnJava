package org.mishrashu.multithreading;

public class SequentialNumberPrinter {

  private final int N ;
  private int counter = 1;
  private final   Object lock = new Object();

  public SequentialNumberPrinter(int N){
    this.N = N;
  }


  public void printNumber(int threadId){
    while(true){
      synchronized (lock){
        while(counter <= N && counter%3!=threadId){
          try{
            lock.wait();
          } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
          }
        }

        if(counter > N){
          break;
        }

        System.out.println("Thread " + (threadId + 1) + ": "+ counter++);
        lock.notifyAll();
      }
    }
  }

  public static void main(String[] args) {
    int N = 10;
    SequentialNumberPrinter sequentialNumberPrinter = new SequentialNumberPrinter(N);
    Thread t1 = new Thread(() -> sequentialNumberPrinter.printNumber(1));
    Thread t2 = new Thread(() -> sequentialNumberPrinter.printNumber(2));

    Thread t3 = new Thread(() -> sequentialNumberPrinter.printNumber(0));


    t1.start();
    t2.start();
    t3.start();
  }

}
