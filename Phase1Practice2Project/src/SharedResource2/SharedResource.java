package SharedResource2;

public class SharedResource {
    private boolean flag = false;

    synchronized void printNumbers() {
        for (int i = 1; i <= 5; i++) {
            while (flag) {
                try {
                    wait(); // Release the lock and wait for notify
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(1000); // Simulate some processing time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            flag = true;
            notify(); // Notify the waiting thread

            // If it's not the last iteration, wait for the other thread to print
            if (i < 5) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
