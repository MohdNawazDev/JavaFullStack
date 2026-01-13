
class MyThread extends Thread{
//    @Override
    public void run() {
        for(int i = 0; i <= 5; i++){
            System.out.println("Thread running from MyThread Class " + Thread.currentThread().getName());
        }
    }
}

public class MainThread {
    public static void main(String[] args) {
        MyThread t = new MyThread(); //instantiation of thread
        t.start();

        MyThread t2 = new MyThread(); //instantiation of thread
        t2.start();
        for(int i = 0; i <= 5; i++){
            System.out.println("Printing from Main Thread" + Thread.currentThread().getName());
        }


    }
}
