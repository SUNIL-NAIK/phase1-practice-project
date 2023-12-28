package MyThread1;

class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread extending Thread class: " + i);
        }
    }
}

public class Threada {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start(); // Start the thread
    }
}
