// Assignment #: 6
//         Name: Yousuf Khoori
//    StudentID: 1218037782
//      Lecture: MWF 11:50AM
//  Description: The class Club represents a Club.

public class Club
{
    private String clubName;
    private int numberOfMembers;
    private String university;

    //Constructor to initialize all member variables
    public Club(String cName, int nMembers, String uni)
    {
        clubName = cName;
        university = uni;
        numberOfMembers = nMembers;
    }

    //Accessor methods
    public String getClubName()
    {
        return clubName;
    }

    public String getUniversity()
    {
        return university;
    }

    public int getNumberOfMembers()
    {
        return numberOfMembers;
    }

    //Mutator methods
    public void setClubName(String someClubName)
    {
        clubName = someClubName;
    }

    public void setUniversity(String someUniversity)
    {
        university = someUniversity;
    }

    public void setNumberOfMembers(int someNumber)
    {
        numberOfMembers = someNumber;
    }

    //toString() method returns a string containg its name, number of members, and university
    public String toString()
    {
        String result = "\nClub Name:\t\t" + clubName
                + "\nNumber Of Members:\t" + numberOfMembers
                + "\nUniversity:\t\t" + university
                + "\n\n";
        return result;
    }
}