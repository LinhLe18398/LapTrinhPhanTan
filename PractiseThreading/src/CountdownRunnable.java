public class CountdownRunnable implements Runnable{
    @Override
    public void run(){
        for (int i = 10; i >= 1; i--){
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Main5{
    public static void main(String[] args) {
        CountdownRunnable countdownRunnable = new CountdownRunnable();
        Thread thread = new Thread(countdownRunnable);
        thread.start();
    }
}
