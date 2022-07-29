package springbasic;

public class Start extends Thread{
    static int share;

    public static void main(String[] args) {
        Start t1 = new Start();
        Start t2 = new Start();

        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(share++);

            try {
                sleep(30000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
