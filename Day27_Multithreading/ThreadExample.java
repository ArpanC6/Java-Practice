class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread: " + i);
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start(); // starts new thread

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: " + i);
        }
    }
}
