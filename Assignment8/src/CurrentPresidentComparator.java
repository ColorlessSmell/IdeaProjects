import java.util.Comparator;

public class CurrentPresidentComparator implements Comparator<President>{

    public int compare(President p1, President p2){

        String lNamep1 = p1.getLastName();
        String lNamep2 = p2.getLastName();

        if (lNamep1.equals(lNamep2)) {

            String fNamep1 = p1.getFirstName();
            String fNamep2 = p2.getFirstName();

            return fNamep1.compareTo(fNamep2);

        } else {
            return lNamep1.compareTo(lNamep2);
        }
    }

}
