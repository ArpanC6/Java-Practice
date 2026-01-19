class Buffer {
    int item;
    boolean produced = false;

    synchronized void produce(int value) throws InterruptedException {
        while (produced) {
            wait();
        }
        item = value;
        System.out.println("Producer produced: " + item);
        produced = true;
        notify();
    }

    synchronized void consume() throws InterruptedException {
        while (!produced) {
            wait();
        }
        System.out.println("Consumer consumed: " + item);
        produced = false;
        notify();
    }
}

class ProducerThread extends Thread {
    Buffer b;

    ProducerThread(Buffer b) {
        this.b = b;
    }

    public void run() {
        try {
            b.produce(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ConsumerThread extends Thread {
    Buffer b;

    ConsumerThread(Buffer b) {
        this.b = b;
    }

    public void run() {
        try {
            b.consume();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        Buffer b = new Buffer();

        new ProducerThread(b).start();
        new ConsumerThread(b).start();
    }
}
