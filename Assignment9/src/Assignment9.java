import jdk.internal.util.xml.impl.Input;

import java.io.*;

public class Assignment9 {

    private int[] anArray = new int[100];

    public static void main(String[] args){



    }

    public static int findMin(int[] numbers, int startIndex, int endIndex){

    }

    public static int countOddNumbers(int[] elements, int startIndex, int endIndex){

    }

    public static int computeLargestEven(int[] elements, int startIndex, int endIndex){

    }

    public static int sumOfNumbersLargerThanFirst(int[] elements, int startIndex, int endIndex, int firstNumber){

    }

    public int[] arrayOfNum(){

        int counter = -1;
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        String temp = br.readLine();
        int x = Integer.parseInt(temp);

        if (x != 0){
               counter++;
               anArray[counter] = arrayOfNum();
        } else if (x == 0) {
            counter++;
            anArray[counter] = 0;
            return anArray;

        }

    }

    public int testingNum(int n){

        if (n > 0){
            return n-1;
        } else {
            return n;
        }
    }

}
