import jdk.internal.util.xml.impl.Input;

import java.io.*;

public class Assignment9 {


    public static void main(String[] args) throws IOException {

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    int counter = 1;
    String x = br.readLine();
    int y = Integer.parseInt(x);
    int[] array = new int[];
    array[0] = y;

    while (y != 0){
        x = br.readLine();
        y = Integer.parseInt(x);
        array[counter] = y;
        counter++;
    }

    }

    //Recursive method to find the minimum number in the array
    //Paramters it take is the array to find the minimum, timesDone is the counter
    //and newMinimum holds the index of the current minimum in the list
    public static int findMin(int[] someArray, int timesDone, int newMinimum){
        int currentMinimum = someArray[newMinimum];
        if (timesDone == someArray.length - 1){
            if (someArray[newMinimum] > someArray[timesDone]){
                return someArray[timesDone];
            } else {
                return currentMinimum;
            }
        } else {
            timesDone++;
            int maybeNew = someArray[timesDone];
            if (currentMinimum > maybeNew){
                return findMin(someArray, timesDone, timesDone);
            } else {
                return findMin(someArray, timesDone, newMinimum);
            }
        }

    }

    public static int countOddNumbers(int[] elements, int startIndex, int endIndex){

    }

    public static int computeLargestEven(int[] elements, int startIndex, int endIndex){

    }

    public static int sumOfNumbersLargerThanFirst(int[] elements, int startIndex, int endIndex, int firstNumber){

    }

}
