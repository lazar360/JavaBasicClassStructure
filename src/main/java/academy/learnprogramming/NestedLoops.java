package academy.learnprogramming;

import java.util.Arrays;

public class NestedLoops {
    public static void main(String[] args) {

        for(int hours = 1; hours <= 6; hours++){
            for(int minutes = 0; minutes < 60; minutes++){
         //       System.out.println(hours +" : "+minutes);
            }
        }

        int[][] myArray = {
                {1,2,3},
                {5,9,4},
                {7,2,3},
        };

        System.out.println(myArray);
        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.deepToString(myArray));

        OUTER :
        for(int[] rowArray : myArray){
            INNER :
            for(int i = 0; i < rowArray.length; i++){
                if(rowArray[i] % 2 == 0){
                    // break INNER;
                    // break OUTER;
                    // continue INNER;
                    // continue OUTER;
                }
                System.out.println(rowArray[i] + " ");
            }
            System.out.println("------");
        }

        int x = 10;

        while(x>0){

            do{
                // 1. execute until x = 5
                // 3. x = 3
                // 5. x = 1
                x-= 1;
            } while (x>5);
            // 2. x-- -> x = 4
            // 4. x-- -> x = 2
            // 6. x-- -> x = 0
            x--;

            // prints 4
            // prints 2
            // prints 0
            System.out.println(x);


        }
    }
}
