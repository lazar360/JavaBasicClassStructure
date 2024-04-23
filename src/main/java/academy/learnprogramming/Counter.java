package academy.learnprogramming;

public class Counter {
    public static int count;
    public int anotherCount;

    public Counter(){
        count++;
        anotherCount++;
    }

    public static void main(String[] args) {
        Counter one = new Counter();
        Counter two = new Counter();
        Counter three = new Counter();
        Counter four = new Counter();

        System.out.println(count); // 4
        System.out.println(one.count); // 4
        System.out.println(two.count); // 4
        System.out.println(three.count); // 4
        System.out.println(four.count); // 4

        System.out.println(one.anotherCount); // 1
        System.out.println(two.anotherCount); // 1
        System.out.println(three.anotherCount); // 1
        System.out.println(four.anotherCount); // 1
    }
}
