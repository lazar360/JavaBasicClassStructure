package constructor;

public class Counter {

    int count;
    private static void increment(Counter counter){
        counter.count++; // counter.count = counter.count + 1;
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = c1;
        Counter c3 = null;
        c2.count = 1000;
        System.out.println("c1.count= " + c1.count); // 1000
        System.out.println("c2.count= " + c2.count); // 1000
        increment(c2);
        System.out.println("c1.count= " + c1.count); // 1001
        System.out.println("c2.count= " + c2.count); // 1001
    }
}
