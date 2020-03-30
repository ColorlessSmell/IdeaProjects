//Demonstration of using InputStreamReader & BufferedReader class to read from keyboard
//This program allow user to enter undefined number of integers from keyboard,
//it then compute the sum of these integers. It is a sentinel value (-1) controlled while loop

import java.io.*;

public class InputStreamReaderDemo
{
    public static void main(String[] args)
    {
        int x, sum = 0;
        String tempStr;

        //create an InputStreamReader object to read from keyborad
        InputStreamReader ir = new InputStreamReader(System.in);

        //create a BufferedReader object
        BufferedReader br = new BufferedReader(ir);

        //prime read
        System.out.print("Please enter integers and I will compute the sum (enter -1 to stop): ");
        try
        {
            //read in the string first
            tempStr = br.readLine();

            //convert it into an integer
            x = Integer.parseInt(tempStr);

            while (x != -1)
            {
                sum += x;
                System.out.print("Please enter the next integers and I will compute the sum (enter -1 to stop): ");

                //read in the next string first
                tempStr = br.readLine();

                //convert it to an integer
                x = Integer.parseInt(tempStr);
            }
        }

        catch (IOException ex)
        {
            System.out.println("Wrong! catched " + ex);
        }
        System.out.println();
        System.out.println("sum is: " + sum);
    }
}