package academy.learnprogramming;

public class CharacterArithmetic {

    public static void main(String[] args) {
        // char 0 - 65535
        char myCharA = 'A';
        char myCharNum = '1';

        // exam example
        char letter = 65; // thread.A
        int myInt = letter + 3;
        char myNewLetter = (char) myInt;

        char myChar = 65; // thread.A
        char newChar = (char) (myChar + 1); // 66 -> B
        boolean b = newChar == 'B'; // true
        boolean c = (newChar++ == 'C'); // false - on utilise newChar puis on incrémente
        System.out.println("myChar " + myChar);
        System.out.println("newChar " + newChar);
        System.out.println("b " + b);
        System.out.println("c " + c);

        // Question examples
        // thread.A, D
        // thread.A, B, D
        // C, D, F
        /*
        3: boolean x = true, z = true;
        4: int y = 20;
        5: x = (y != 10) ^ (z=false);
            x = true ^ false -> true
        6: sout du tout
        x = true, y = 20, z = false
        B
        */
        // thread.A
        // C

    }
}
