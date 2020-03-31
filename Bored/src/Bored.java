import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.*;

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
//        int[] anArray = new int[5];
//                anArray = new int[]{3, 4, 6, 8, 10};
//        System.out.println("The minimum is:\t" + findMinimum(anArray, 0, 0));


                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);

        //creating scanner object for reading input

        //initializing array
//        int[] array = new int[100];
//
//        //This represents the amount of elements the user added, also acts as the counter when processing input
//        int counter = 0;
//        //String for input
//        String input = "";
//
//        //Keep getting user input until 0 is entered
//        //Will still store 0
//        while (!input.equals("0")) {
//            input = br.readLine();
//            array[counter] = Integer.parseInt(input);
//            counter++;
//        }
//
//        //printing array
//        for (int i = 0; i < counter; i++) {
//            System.out.print(i + ", ");
//        }
//        System.out.println();
//        System.out.println("Elements in array: " + counter);

//                int counter = 1;
//                String x = br.readLine();
//                int[] array = new int[100];
//                array[0] = Integer.parseInt(x);
//
//                while (!x.equals("0")){
//                    x = br.readLine();
//                    array[counter] = Integer.parseInt(x);
//                    counter++;
//                    System.out.println("Counter is: " + counter);
//                }
//
//                array[counter] = 0;
//
//                for (int i = 0; i < counter; i++){
//                    System.out.print(array[i] + "\t");
//                }
//                System.out.print("\n" + counter);

        System.out.println(-12 % 3);

            }
        }

//    public static int findMinimum(int[] someArray, int timesDone, int newMinimum){
//        int currentMinimum = someArray[newMinimum];
//
//        if (timesDone == someArray.length - 1){
//            if (someArray[newMinimum] > someArray[timesDone]){
//                return someArray[timesDone];
//            } else {
//                return currentMinimum;
//            }
//        } else {
//            timesDone++;
//            int maybeNew = someArray[timesDone];
//            if (currentMinimum > maybeNew){
//                return findMinimum(someArray, timesDone, timesDone);
//            } else {
//                return findMinimum(someArray, timesDone, newMinimum);
//            }
//        }
//
//    }
