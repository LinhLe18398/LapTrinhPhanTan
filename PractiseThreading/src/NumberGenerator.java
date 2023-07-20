public class NumberGenerator implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Main6 {
    public static void main(String[] args) {
        NumberGenerator numberGenerator1 = new NumberGenerator();
        Thread threadNumberGenerator1 = new Thread(numberGenerator1);
        threadNumberGenerator1.setPriority(Thread.MAX_PRIORITY);
        System.out.println(threadNumberGenerator1.getPriority());
        NumberGenerator numberGenerator2 = new NumberGenerator();
        Thread threadNumberGenerator2 = new Thread(numberGenerator2);
        threadNumberGenerator2.setPriority(Thread.MIN_PRIORITY);


       threadNumberGenerator1.start();
       threadNumberGenerator2.start();

    }
}
