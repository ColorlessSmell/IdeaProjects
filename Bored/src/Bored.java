import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Bored {

    private int counter = -1;
    private int[] anArray = new int[100];

    public static void main(String[] args) throws IOException {

//        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
//
//        ArrayList primeNums = new ArrayList();
//
//        for (int i = 0; i < numbers.length; i++){
//
//            for (int j = 0; j < numbers[i]; j++)
//            if (numbers[i] % 2 > 0 && numbers[i] % 3 > 0){
//                primeNums.add(numbers[i]);
//            }
//
//        }
//
//        for (int i = 0; i < primeNums.size(); i++){
//            System.out.println(primeNums.get(i));
//        }
//
//        String x = "50";
//        int y = Integer.parseInt(x);
//        System.out.println(y);
        int[] anArray = new int[5];
                anArray = new int[]{3, 4, 6, 8, 0, 2};
        System.out.println(findMinimum(anArray, anArray[0], 1));
        }

    public static int findMinimum(int[] someArray, int timesDone, int newMinimum){
        int currentMinimum = someArray[newMinimum];
        if(timesDone < someArray.length - 1){
            int maybeNew = someArray[newMinimum++];
            if (currentMinimum > maybeNew){
                int something = timesDone++;
                return findMinimum(someArray, something, maybeNew);
            } else {
                int newTimes = timesDone++;
                return findMinimum(someArray, newTimes, currentMinimum);
            }
        } else if (timesDone == someArray.length - 1){
            return currentMinimum;
        }

    }






}
