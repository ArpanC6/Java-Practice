class SharedResource {
    int data;
    boolean available = false;

    synchronized void produce(int value) throws InterruptedException {
        if (available) {
            wait();
        }
        data = value;
        System.out.println("Produced: " + data);
        available = true;
        notify();
    }

    synchronized int consume() throws InterruptedException {
        if (!available) {
            wait();
        }
        System.out.println("Consumed: " + data);
        available = false;
        notify();
        return data;
    }
}

class Producer extends Thread {
    SharedResource sr;

    Producer(SharedResource sr) {
        this.sr = sr;
    }

    public void run() {
        try {
            sr.produce(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer extends Thread {
    SharedResource sr;

    Consumer(SharedResource sr) {
        this.sr = sr;
    }

    public void run() {
        try {
            sr.consume();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class WaitNotifyExample {
    public static void main(String[] args) {
        SharedResource sr = new SharedResource();

        new Producer(sr).start();
        new Consumer(sr).start();
    }
}
