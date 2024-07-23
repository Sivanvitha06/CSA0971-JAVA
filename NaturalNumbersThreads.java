class NaturalNumbersThreads {
    public static void main(String[] args) {
        Runnable printNumbers = new Runnable() {
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    try {
                        Thread.sleep(1000); // Sleep for 1 second
                        System.out.println(Thread.currentThread().getName() + ": " + i);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread thread1 = new Thread(printNumbers, "Thread-1");
        Thread thread2 = new Thread(printNumbers, "Thread-2");
        Thread thread3 = new Thread(printNumbers, "Thread-3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}