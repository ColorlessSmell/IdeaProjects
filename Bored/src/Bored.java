import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Bored {


    public static void main(String[] args) {

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

        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.nextLine();
            String y=sc.nextLine();
            int x = Integer.parseInt(y);
            System.out.printf("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");
    }

}
