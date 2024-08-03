class FibonacciTask implements Runnable {
    private int terms;

    public FibonacciTask(int terms) {
        this.terms = terms;
    }

    @Override
    public void run() {
        if (terms <= 0) {
            System.out.println("Number of terms must be positive.");
            return;
        }

        long[] fibonacciSeries = new long[terms];
        fibonacciSeries[0] = 0;
        if (terms > 1) {
            fibonacciSeries[1] = 1;
        }

        for (int i = 2; i < terms; i++) {
            fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
        }

        System.out.print("Fibonacci Series: ");
        for (long num : fibonacciSeries) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

class easy6 {

    public static void main(String[] args) {
        int numTerms = 5; // Sample Input

        // Create and start the Fibonacci thread
        Thread fibonacciThread = new Thread(new FibonacciTask(numTerms));
        fibonacciThread.start();

        try {
            fibonacciThread.join(); // Wait for the thread to complete
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
    }
}