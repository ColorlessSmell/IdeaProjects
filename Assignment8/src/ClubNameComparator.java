import java.util.Comparator;

public class ClubNameComparator implements Comparator<Club>{

    private String c1Name;
    private String c2Name;

    //this is the abstract method inside the Comparator interface
    public int compare(Club c1, Club c2)
    {
        int result = 0;
        //compare their last names first, if last name same, then
        //compare their first names
        if (c1 != null && c2 != null) {
            c1Name = c1.getClubName();
            c2Name = c2.getClubName();
            result = c1Name.compareTo(c2Name);
        } else if (c1 == null && c2 != null){

            result = -1;

        } else if (c1 != null && c2 == null){

            result = 1;

        }

        return result;



    }

}
