public class LazyPrimeFactorization implements Runnable {
    @Override
    public void run() {
        System.out.println("LazyPrimeFactorization is running...");
        for (int number = 2; number < 200; number++) {
            if (isPrimeNumber(number)) {
                System.out.println(number);
            }
        }

    }

    public static boolean isPrimeNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}


class OptimizedPrimeFactorization implements Runnable {
    @Override
    public void run() {
        System.out.println("OptimizedFactorization is running...");
        for (int number = 2; number < 200; number++) {
            if (isPrime(number)) {
                System.out.println(number);
            }
        }

    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

class Main8{
    public static void main(String[] args) {
        Runnable lazyPrime = new LazyPrimeFactorization();
        Runnable optimizedPrime = new OptimizedPrimeFactorization();

        Thread thread1 = new Thread(lazyPrime);
        Thread thread2 = new Thread(optimizedPrime);

        thread2.start();
        thread1.start();
    }
}
