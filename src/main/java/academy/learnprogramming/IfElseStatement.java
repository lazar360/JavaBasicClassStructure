package academy.learnprogramming;

public class IfElseStatement {
    public static void main(String[] args) {
        boolean b = false;
        if (!b){
            System.out.println("false");
        } else {
            System.out.println("true");
        }

        int x = 1;
        //if(x){} does not compile
        //if(x=1){} does not compile

        //-----------
        int hoursOfDay = 10;
        if(hoursOfDay<11) System.out.println("Morning");
        else if(hoursOfDay<17) System.out.println("Evening");
        else
            System.out.println("Day");

    }
}
