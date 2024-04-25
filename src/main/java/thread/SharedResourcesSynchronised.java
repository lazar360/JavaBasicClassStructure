package thread;

class B extends Thread{

    public static int content2;
    static synchronized void increment(){
        content2++; // partie critique (lock this block of code with synchronised)
    }

    public void run(){
        for (int i = 0; i < 10; i++) {
            increment();
            try {
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class SharedResourcesSynchronised {
    public static void main(String[] args) {
        B b1 = new B();
        B b2 = new B();
        b1.start();
        b2.start();
        try {
            b1.join();
            b2.join();
        } catch (Exception ignored){}
        System.out.println("content= " + B.content2); // normalement 20
    }
}
