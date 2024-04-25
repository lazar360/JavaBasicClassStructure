package thread;

import java.util.Random;

public class ThreadExample {

    static class Request extends Thread {
        String[] request = {"vacation request", "rtt request", "improve remuneration"};

        public void TransmitRequest() {
            for (int i = 0; i < 3; i++) {
                System.out.println(request[new Random().nextInt(0,3)]);
            }
        }

        public void run(){
            TransmitRequest();
        }
    }

    static class InfoForRequest extends Thread {
        String[] info = {"need to go to Bahamas", "my aunt is dead", "I work hard every day"};

        public void TransmitInfo() {
            for (int i = 0; i < 3; i++) {
                System.out.println(info[new Random().nextInt(0,3)]);
            }
        }

        public void run(){
            TransmitInfo();
        }
    }

    public static void main(String[] args) {

        Request theRequest = new Request();
        InfoForRequest theInfoForRequest = new InfoForRequest();
        // Start the run methods
        theRequest.start();
        theInfoForRequest.start();

        // Define a priority level
        theRequest.setPriority(Thread.MAX_PRIORITY);
        theInfoForRequest.setPriority(Thread.MIN_PRIORITY);

        // Finish run methods before System.out.println("Your boss says : Another thing ?");
        try {
        theInfoForRequest.join();
        theRequest.join();
        } catch (Exception ignored){}
        System.out.println("Your boss says : Another thing ?");

    }
}
