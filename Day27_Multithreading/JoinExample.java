class JoinThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread: " + i);
        }
    }
}

public class JoinExample {
    public static void main(String[] args) throws InterruptedException {
        JoinThread t = new JoinThread();
        t.start();

        t.join(); // main thread waits for child thread

        System.out.println("Main Thread finished");
    }
}
