import java.util.Comparator;

public class MemberNumberComparator implements Comparator<Club>{

    //this is the abstract method inside the Comparator interface
    public int compare(Club c1, Club c2)
    {
        //compare their last names first, if last name same, then
        //compare their first names
        int club1 = c1.getNumberOfMembers();
        int club2 = c2.getNumberOfMembers();

        int result = club1 - club2;

        return result;

    }

}
