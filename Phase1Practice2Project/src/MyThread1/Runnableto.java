package MyThread1;

class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread implementing Runnable interface: " + i);
        }
    }
}

public class Runnableto {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread myThread = new Thread();
        myThread.start(); // Start the thread
    }
}
