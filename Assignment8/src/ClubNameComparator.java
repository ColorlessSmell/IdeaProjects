import java.util.Comparator;

public class ClubNameComparator implements Comparator<Club>{

    //this is the abstract method inside the Comparator interface
    public int compare(Club c1, Club c2)
    {
        //compare their last names first, if last name same, then
        //compare their first names
        String c1Name = c1.getClubName();
        String c2Name = c2.getClubName();

        return c1Name.compareTo(c2Name);


    }

}
