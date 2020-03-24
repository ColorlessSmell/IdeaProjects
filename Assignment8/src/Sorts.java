import java.util.*;

public class Sorts {

    public static void sort(ArrayList<Club> clubList, int size, Comparator<Club> newComparator){

        MemberNumberComparator numberComparator = new MemberNumberComparator();
        selectionSort(clubList, numberComparator);

    }

    public static void selectionSort(ArrayList<Club> inputObjectList, Comparator xComparator)
    {
        int min;	//smallest number's index
        Club temp;

        for (int index = 0; index < inputObjectList.size()-1; index++)
        {
            min = index;
            for (int scan = index+1; scan < inputObjectList.size(); scan++)
            {
                //compare the two objects at index "scan" and "min" by using the xComparator
                if ( xComparator.compare(inputObjectList.get(scan), inputObjectList.get(index)) < 0 )
                    min = scan;
            }

            // Swap the two objects
            temp =  inputObjectList.get(min);
            inputObjectList.set(min, inputObjectList.get(index));
            inputObjectList.set(index, temp);

        } //end outer for loop
    } //end selectionSort

}
