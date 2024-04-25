package thread;

import java.util.Random;

public class ThreadExampleSynchronised {

    static final Object lock = new Object();

    static class Request extends Thread {
        String[] request = {"vacation request", "rtt request", "improve remuneration"};

        public void TransmitRequest() {
            synchronized (lock) {
                for (int i = 0; i < 3; i++) {
                    System.out.println(request[new Random().nextInt(0, 3)]);
                    lock.notify(); // Notify the other thread
                    try {
                        lock.wait(); // Wait for the other thread to finish
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                lock.notify(); // Notify the other thread to finish
            }
        }
        public void run() {
            TransmitRequest();
        }
    }

    static class InfoForRequest extends Thread {
        String[] info = {"need to go to Bahamas", "my aunt is dead", "I work hard every day"};

        public void TransmitInfo() {
            synchronized (lock) {
                for (int i = 0; i < 3; i++) {
                    System.out.println(info[new Random().nextInt(0, 3)]);
                    lock.notify(); // Notify the other thread
                    try {
                        if (i < 2) {
                            lock.wait(); // Wait for the other thread to finish
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                lock.notify(); // Notify the other thread to finish
            }
        }

        public void run() {
            TransmitInfo();
        }
    }

    public static void main(String[] args) {
        Request theRequest = new Request();
        InfoForRequest theInfoForRequest = new InfoForRequest();

        theRequest.start();
        theInfoForRequest.start();

        try {
            theInfoForRequest.join();
            theRequest.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Your boss says: Another thing ?");
    }
}
