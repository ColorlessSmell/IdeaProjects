import java.util.*;

public class Sorts {

    public static void sort(Club[] clubList, int size, Comparator<Club> newComparator){

        MemberNumberComparator numberComparator = new MemberNumberComparator();
        selectionSort(clubList, numberComparator);

    }

    public static void selectionSort(Club[] inputObjectList, Comparator xComparator)
    {
        int min;	//smallest number's index
        Club temp;

        for (int index = 0; index < inputObjectList.length()-1; index++)
        {
            min = index;
            for (int scan = index+1; scan < inputObjectList.length(); scan++)
            {
                //compare the two objects at index "scan" and "min" by using the xComparator
                if ( xComparator.compare(inputObjectList[scan], inputObjectList[index]) < 0 )
                    min = scan;
            }

            // Swap the two objects
            temp =  inputObjectList[min];
            inputObjectList[min] = inputObjectList[index];
            inputObjectList[index] = temp;

        } //end outer for loop
    } //end selectionSort

}
