class LifeCycle extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }
}

public class ThreadLifecycleDemo {
    public static void main(String[] args) {
        LifeCycle t = new LifeCycle();

        System.out.println("Thread State after creation: " + t.getState());
        t.start();
        System.out.println("Thread State after start: " + t.getState());
    }
}
