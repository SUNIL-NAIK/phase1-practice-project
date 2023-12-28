package SharedResource2;

public class SleepWaitDemo {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        // Create two threads
        Thread thread1 = new Thread(new NumberPrinter(sharedResource), "Thread-1");
        Thread thread2 = new Thread(new NumberPrinter(sharedResource), "Thread-2");

        // Start the threads
        thread1.start();
        thread2.start();
    }
}

class NumberPrinter implements Runnable {
    private SharedResource sharedResource;

    public NumberPrinter(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        sharedResource.printNumbers();
    }
}
