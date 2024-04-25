package thread;

public class AlternateMethods {
    static Object lock = new Object();
    static int currentMethod = 1;

    static class Method1 extends Thread {
        public void method1() {
            synchronized (lock) {
                try {
                    while (currentMethod != 1) {
                        lock.wait();
                    }
                    System.out.println("Method 1");
                    currentMethod = 2;
                    lock.notifyAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public void run() {
            method1();
        }
    }

    static class Method2 extends Thread {
        public void method2() {
            synchronized (lock) {
                try {
                    while (currentMethod != 2) {
                        lock.wait();
                    }
                    System.out.println("Method 2");
                    currentMethod = 3;
                    lock.notifyAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public void run() {
            method2();
        }
    }

    static class Method3 extends Thread {
        public void method3() {
            synchronized (lock) {
                try {
                    while (currentMethod != 3) {
                        lock.wait();
                    }
                    System.out.println("Method 3");
                    currentMethod = 1;
                    lock.notifyAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public void run() {
            method3();
        }
    }

    public static void main(String[] args) {
        Method1 method1 = new Method1();
        Method2 method2 = new Method2();
        Method3 method3 = new Method3();

        method1.start();
        method2.start();
        method3.start();
    }
}
