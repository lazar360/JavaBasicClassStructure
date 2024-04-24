package academy.learnprogramming;

public class DoWhileLoop {
    public static void main(String[] args) {

        //-----------
        int a = 0;

        do {
            a++;
        } while (false);
        //a = 1
        System.out.println(a);

        //Does not compile
        /*while(false){
            a++;
        }*/

        //-----------
        int x = 20;
        while (x>10)x--;
        // 10
        System.out.println(x);

        int x2= 20;
        do x2--;
        while (x2>10);
        // 10
        System.out.println(x2);

        //-----------
        int y = 10;
        int z = 5;
        while(y < 20)
            y++;
            z+=2;
            y+=10;

            /*
            The same as
        while(y < 20){
            y++;
        }
        z+=2;
        y+=10;*/
        // y = 30
        // z = 5
        System.out.println(y +","+z);

        //-----------
        int number = 10;

        // always false
        while(number > 10){
            number--;
        }

        do{
            number--;
            // 9
            while(number > 5){
                number +=1;
                // 10
            }
        } while (number < 10);
        // false
        // infinite loop
        System.out.println(number);
    }
}
