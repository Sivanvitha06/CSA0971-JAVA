class MultiplicationTask implements Runnable {
    private int number;

    public MultiplicationTask(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName() + " is now in RUNNABLE state.");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " X " + i + " = " + (number * i));
            try {
                // Simulating some work with sleep
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
        System.out.println("Thread " + Thread.currentThread().getName() + " is now in TERMINATED state.");
    }
}

class MultiplicationTables {

    public static void main(String[] args) {
        // Input numbers for multiplication tables
        int num1 = 5;
        int num2 = 10;

        // Creating threads for each number
        Thread thread1 = new Thread(new MultiplicationTask(num1), "Thread-1");
        Thread thread2 = new Thread(new MultiplicationTask(num2), "Thread-2");

        // Display thread states
        System.out.println("Thread-1 is in state: " + thread1.getState());
        System.out.println("Thread-2 is in state: " + thread2.getState());

        // Start threads
        thread1.start();
        thread2.start();

        try {
            // Wait for threads to complete
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        // Display thread states after completion
        System.out.println("Thread-1 is in state: " + thread1.getState());
        System.out.println("Thread-2 is in state: " + thread2.getState());
    }
}