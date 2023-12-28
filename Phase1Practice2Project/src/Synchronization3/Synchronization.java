package Synchronization3;

class Counter {
    private int count = 0;

    // Synchronized method to increment the counter
    public synchronized void increment() {
        count++;
    }

    // Method to retrieve the current value of the counter
    public int getCount() {
        return count;
    }
}

class IncrementThread extends Thread {
    private Counter counter;

    public IncrementThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class Synchronization {
    public static void main(String[] args) throws InterruptedException {
        // Create a shared counter
        Counter counter = new Counter();

        // Create multiple threads that will increment the counter
        IncrementThread thread1 = new IncrementThread(counter);
        IncrementThread thread2 = new IncrementThread(counter);

        // Start the threads
        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        thread1.join();
        thread2.join();

        // Display the final value of the counter
        System.out.println("Final Counter Value: " + counter.getCount());
    }
}

