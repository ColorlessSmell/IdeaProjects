import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class ClubManagement extends Sorts implements Serializable{

    public Club[] clubList;
    public int numberOfClubs;
    private int maxSize;

    /*
    This is the Constructor of the ClubManagement class.
    It initializes the instance variables as well as every
    object in the Club array to null.
     */
    public ClubManagement(int maximumSize){

        maxSize = maximumSize;
        numberOfClubs = 0;
        clubList = new Club[maxSize];
        Club club = null;

        for (int i = 0; i < maxSize; i++) {

            clubList[i] = club;

        }

    }

    /*
    This method searches for a Club object by clubName and its university,
    and return the index of the object if found. Return -1 if not found.
    The parameters are the club name and the university of a Club object.
     */
    public int clubExists(String clubName, String university){

        int result = -1;
        int i = 0;

        while (clubList[i] != null && !clubList[i].getClubName().equals(clubName) && !clubList[i].getUniversity().equals(university)){
            int k = 0;
            if (clubList[i].getClubName().equals(clubName) && clubList[i].getUniversity().equals(university)){
                result = k;
            } else {
                i++;
                k++;
                result = -1;
            }

        }

        return result;

    }

    /*
    This method searches the clubList objects for the president, returns index if president is found
    returns -1 if not found.
     */
    public int currentPresidentExists(String firstName, String lastName, String academicLevel){

        int result = 0;
        int i = 0;

        while (clubList[i] != null && !clubList[i].getCurrentPresident().getFirstName().equals(firstName) && !clubList[i].getCurrentPresident().getLastName().equals(lastName) && !clubList[i].getCurrentPresident().getAcademicLevel().equals(academicLevel)){

            if (clubList[i].getCurrentPresident().getFirstName().equals(firstName) && clubList[i].getCurrentPresident().getLastName().equals(lastName) && clubList[i].getCurrentPresident().getAcademicLevel().equals(academicLevel)){
                result = i;
            } else {
                result = -1;
                i++;
            }

        }

        return result;

    }

    /*
    Add a Club object to the club list and return true if such object was added successfully.
    Return false if an object with the same club name and university already exists or numberOfClubs
    is already same as maxSize, i.e., the array is full (the new object is not added).

     */
    public boolean addClub(String clubName, int numberOfMembers, String university, String firstName, String lastName, String academicLevel){

    boolean result = true;
    int checking = clubExists(clubName, university);

    if (numberOfClubs == maxSize){
        result = false;
        System.out.println("maxSize");
    } else if (checking > -1){
        result = false;
        System.out.println(checking);
    } else if (checking == -1) {
        System.out.println(checking);
        President newPresident = new President(firstName, lastName, academicLevel);
        Club newClub = new Club(clubName, numberOfMembers, university, newPresident);
        clubList[numberOfClubs+1] = newClub;
        numberOfClubs++;
        result = true;
    }

    return result;

    }

    /*
    Remove a Club object of the parameter clubName and the university from
    the club list. Return true if the object was removed successfully.
    Return false if the object with the given club name and university does not exist.
     */

    public boolean removeClub(String clubName, String university){

    boolean result = false;
    int checking = clubExists(clubName, university);

    if (checking > -1){
        result = false;
    } else {
        clubList[checking] = clubList[numberOfClubs+1];
        clubList[checking] = null;
        numberOfClubs--;
        result = true;
    }

    return result;

    }

    /*
    The following 3 methods sort the club objects by comparing either
    the club names or the member numbers or the current presidents alphabetically
     */

    public void sortByClubNames(){

        ClubNameComparator nameComparator = new ClubNameComparator();
        sort(clubList, numberOfClubs, nameComparator);

    }

    public void sortByMemberNumbers(){

        MemberNumberComparator compareByNumbers = new MemberNumberComparator();
        sort(clubList, numberOfClubs, compareByNumbers);

    }

    public void sortByCurrentPresidents(){

        CurrentPresidentComparator presidentComparator = new CurrentPresidentComparator();
        sort(clubList, numberOfClubs, presidentComparator);

    }

    public String listClubs(){

        int i = 0;
        String result = "";

        while (clubList[i] != null && i < numberOfClubs){

            result += clubList[i].toString();
            i++;

        }

        return result;

    }

    public void closeClubManagement(){

        numberOfClubs = 0;

        for (int i = 0; i < numberOfClubs; i++){

            clubList[i] = null;

        }

    }

}
