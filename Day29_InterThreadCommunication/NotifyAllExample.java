class Shared {
    synchronized void display() {
        System.out.println(Thread.currentThread().getName() + " is waiting");
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " resumed");
    }

    synchronized void wakeUpAll() {
        System.out.println("Notifying all threads...");
        notifyAll();
    }
}

class MyThread extends Thread {
    Shared s;

    MyThread(Shared s, String name) {
        super(name);
        this.s = s;
    }

    public void run() {
        s.display();
    }
}

public class NotifyAllExample {
    public static void main(String[] args) throws InterruptedException {
        Shared s = new Shared();

        MyThread t1 = new MyThread(s, "Thread-1");
        MyThread t2 = new MyThread(s, "Thread-2");
        MyThread t3 = new MyThread(s, "Thread-3");

        t1.start();
        t2.start();
        t3.start();

        Thread.sleep(2000);
        s.wakeUpAll();
    }
}
