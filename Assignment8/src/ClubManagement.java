import java.io.Serializable;
import java.util.ArrayList;

public class ClubManagement implements Serializable {

    public Club[] clubList;
    private int numberOfClubs;
    private int maxSize;

    public ClubManagement(int maximumSize){

        maxSize = maximumSize;
        numberOfClubs = 0;

        for (int i = 0; i < maxSize; i++) {

            clubList.get(i) = null;

        }

        /*A Constructor of the ClubManagement class. Using the parameter value,
        it should initialize the member variable maxSize. Then it should instantiate
        an array of Club objects using the maxSize, and initialize each slot of the
        array to null for every index. It should also initialize the member variable numberOfClubs to 0.
        */
    }

}
