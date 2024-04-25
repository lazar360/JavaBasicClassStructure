package thread;

class A extends Thread{
    public static int content1;

    public void run(){
        for (int i = 0; i < 10; i++) {
        content1++; // partie critique (lock this block of code)
            try {
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class SharedResources {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        a1.start();
        a2.start();
        try {
            a1.join();
            a2.join();
        } catch (Exception ignored){}
        System.out.println("content= " + A.content1); // normalement 20
    }
}
