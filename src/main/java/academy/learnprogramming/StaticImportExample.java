package academy.learnprogramming;

import static java.lang.Math.*;
import static java.lang.System.out;
import static academy.learnprogramming.Config.*;


public class StaticImportExample {
    public static void main(String[] args) {
        out.println("min="+min(5, 7));
        out.println("Math.PI="+PI);
        printConfig();
        out.println("name = "+NAME);
        out.println("columnCount = "+MAX_COLUMN_COUNT);
    }
}
