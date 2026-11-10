package OOP.ObjectClassMethods;

class Shared {
    synchronized void waitMethod() {

        System.out.println("Thread 1: Waiting...");

        try {
            wait(); // Releases the monitor and waits
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Thread 1: Woke up!");
    }

    synchronized void notifyMethod() {

        System.out.println("Thread 2: Notifying...");
        notify(); // Wakes one waiting thread
    }
}

public class WaitNotify {
    public static void main(String[] args) {

        Shared obj = new Shared();

        Thread t1 = new Thread(() -> {
            obj.waitMethod();
        });

        Thread t2 = new Thread(() -> {
            obj.notifyMethod();
        });

        t1.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        t2.start();
    }
}