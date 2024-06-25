package academy.learnprogramming;

public class StringBuilderExample {
    public static void main(String[] args) {
        String myString = "";
        for (char c = 'a'; c<='z'; c++){
            myString+=c; // every iteration this will create a new String object
        }

        System.out.println(myString);

        StringBuilder sb = new StringBuilder();

        for (char c = 'a'; c <= 'z'; c++){
            sb.append(c);// add char to string builder, resuses string builder without creating string each time
        }

        System.out.println(sb);

        //------------
        StringBuilder builder = new StringBuilder("start");
        builder.append("-middle"); //"start-middle"
        StringBuilder anotherBuilder = builder.append("-end");

        System.out.println(builder); // start-middle-end
        System.out.println(anotherBuilder); // start-middle-end

        System.out.println(builder == anotherBuilder);
        System.out.println(System.identityHashCode(builder));
        System.out.println(System.identityHashCode(anotherBuilder));
        //------------
        StringBuilder myBuilder = new StringBuilder();
        System.out.println("size = " + myBuilder.length());
        System.out.println("capacity = " + myBuilder.capacity());

        myBuilder = new StringBuilder(100);
        System.out.println("size = " + myBuilder.length());
        System.out.println("capacity = " + myBuilder.capacity());

        myBuilder.append("MyNewTest");
        System.out.println("size = " + myBuilder.length());
        System.out.println("capacity = " + myBuilder.capacity());
        //--------
        StringBuilder a = new StringBuilder("This ");
        StringBuilder b = a.append("Java "); // assign the same reference
        b = b.append("is").append(" so ").append("Cool");
        System.out.println(a); // This Java is so cool
        System.out.println(b); // this Java is so cool
    }
}
