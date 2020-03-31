// Assignment #: 9
//         Name: Yousuf Khoori
//    StudentID: 1218037782
//      Lecture: MWF 11:50AM
//  Description: Assignment 9 makes use of recursive methods to display the
//               minimum number, minimum even number, sum of odd numbers and
//               count of negative numbers in an array of ints

import java.io.*;

public class Assignment9 {


    public static void main(String[] args) throws IOException {

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    int counter = 0;
    String x = br.readLine();
    int[] array = new int[100];
    array[0] = Integer.parseInt(x);

    while (!x.equals("0")){

        counter++;
        x = br.readLine();
        array[counter] = Integer.parseInt(x);

    }

    System.out.println("The minimum number is " + findMin(array, 0, 0));
    System.out.println("The count of odd integers in the sequence is " + countOddNumbers(array, 0, 0, counter));
    System.out.println("The largest even integer in the sequence is " + largestEven(array, 0, 0, counter));
    System.out.println("The sum of numbers larger than the first is " + + sumLargerThanFirst(array, 0, 0));

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

    //This method counts the number of odd integers in the array
    public static int countOddNumbers(int[] elements, int sum, int timesDone, int trackCount){

        int divisible = elements[timesDone] % 3;

        if (timesDone == trackCount - 1){
            if (divisible == 0 && elements[timesDone] != 0){

                sum++;
                return sum;

            } else {
                return sum;
            }
        } else {
                if (divisible == 0) {
                    sum++;
                    timesDone++;
                    return countOddNumbers(elements, sum, timesDone, trackCount);
                } else {
                    timesDone++;
                    return countOddNumbers(elements, sum, timesDone, trackCount);

            }
        }

    }

    //This method uses the same techniques as findMin but the difference is that
    //it first checks if the number is even or not and instead of finding the smallest
    //it is finding the largest even number
    public static int largestEven(int[] elements, int timesDone, int newMaximum, int trackCount){
        int even = elements[timesDone] % 2;

        if (timesDone == trackCount){

            if (even == 0){
                if (elements[timesDone] > elements[newMaximum]){
                    return elements[timesDone];
                } else {
                    return elements[newMaximum];
                }
            } else {
                return elements[newMaximum];
            }

        } else {

            if (even == 0){
                if (elements[timesDone] > elements[newMaximum]){
                    int aNewMaximum = timesDone;
                    timesDone++;
                    return largestEven(elements, timesDone, aNewMaximum, trackCount);
                } else {
                    timesDone++;
                    return largestEven(elements, timesDone, newMaximum, trackCount);
                }
            } else {
                timesDone++;
                return largestEven(elements, timesDone, newMaximum, trackCount);
            }
        }

    }

    //This method computes the sum of numbers in the array that are larger
    //the element at the first index of the array (index 0)
    public static int sumLargerThanFirst(int[] elements, int sum, int count){

        int firstNum = elements[0];

        if (count == elements.length - 1) {

            sum += elements[count];
            return sum;

        } else {

            if(elements[count] > firstNum) {
                sum += elements[count];
                count++;
                return sumLargerThanFirst(elements, sum, count);
            } else {
                count++;
                return sumLargerThanFirst(elements, sum, count);
            }
        }

    }

}
