package academy.learnprogramming;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        // 1d array
        int[] myArray = {0, 1};

        // 2d array
        int[][] array = new int[2][4]; // 2 rows and 4 columns
        int anotherArray[][] = new int[2][4];
        int[] myIntArray[] = new int[2][4]; // do not use this in a real project

        String[][] my2dArray = new String[][]{
                {"One", "Two"},// 1st row 2 elements
                {"Three", "Four", "Five"}, // 2nd row 3elements
                {"Six", "Seven"}, // 3rd row
                null
        };

        int[][] numberTable = new int[2][3];
        numberTable[0][0] = 1;
        numberTable[0][1] = 2;
        numberTable[1][0] = 1;
        numberTable[1][1] = 2;
        // numberTable[2][0] = 3; // throw an exception

        Map<String, Map<String, String>> map = new HashMap<>();


        //3d array
        // pages, rows, columns
        int[][][] threeArray = new int[3][3][3];
        int oneMoreThreeArray[][][] = new int[3][3][3];

        int[] anotherMoreThreeArray[][] = new int[3][3][3];

        int[][][] threeDArray = {
                {{1,2,3},{1,2,3},{1,2,3}},
                {{1,2,3},{1,2,3},{1,2,3}},
                {{1,2,3},{1,2,3},{1,2,3}}
        };
    }
}
