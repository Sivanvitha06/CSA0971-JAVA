class PrimeCheckTask implements Runnable {
    private int number;

    public PrimeCheckTask(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        if (number <= 1) {
            System.out.println(number + " is not Prime");
            return;
        }

        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(number + " is Prime");
        } else {
            System.out.println(number + " is not Prime");
        }
    }
}

class PrimeNumberChecker {

    public static void main(String[] args) {
        // Sample Input
        int number = 5;

        // Create and start the PrimeCheckTask thread
        Thread primeCheckThread = new Thread(new PrimeCheckTask(number));
        primeCheckThread.start();

        try {
            primeCheckThread.join(); // Wait for the thread to complete
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
    }
}