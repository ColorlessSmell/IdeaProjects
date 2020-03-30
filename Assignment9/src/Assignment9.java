import jdk.internal.util.xml.impl.Input;

import java.io.*;

public class Assignment9 {


    public static void main(String[] args) throws IOException {



    }

    public static int findMin(int[] numbers, int startIndex, int endIndex){



    }

    public static int countOddNumbers(int[] elements, int startIndex, int endIndex){

    }

    public static int computeLargestEven(int[] elements, int startIndex, int endIndex){

    }

    public static int sumOfNumbersLargerThanFirst(int[] elements, int startIndex, int endIndex, int firstNumber){

    }

    public static int[] createArray() throws IOException {
        int[] array = new int[100];
        int counter = 1;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String y = br.readLine();
        int x = Integer.parseInt(y);
        array[0] = x;

        if (x != 0) {
            while (x != 0) {

                y = br.readLine();
                x = Integer.parseInt(y);
                array[counter] = x;
                counter++;

            }
        }

        return array;
    }


    public static int findMinimum(int[] someArray, int minimum, int timesLeft){
        int currentMinimum = someArray[timesLeft];
        int maybeNew = someArray[timesLeft+1];
        if(!(timesLeft > someArray.length)){
           if (currentMinimum < maybeNew){
               int newMinimum = maybeNew;
               int newTimes = timesLeft++;
               return findMinimum(someArray, minimum, newTimes);
           } else {
               int newTimes = timesLeft++;
               return findMinimum(someArray, currentMinimum, newTimes);
           }
        } else {
            return minimum;
        }

    }
}
