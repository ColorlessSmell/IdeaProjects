import java.util.Comparator;

public class CurrentPresidentComparator implements Comparator<President>{

    private String lNamep1;
    private String lNamep2;
    private int result;

    public int compare(President p1, President p2){


        if (p1 != null && p2 != null) {
            lNamep1 = p1.getLastName();
            lNamep2 = p2.getLastName();
        } else if (p1 == null && p2 != null){

            result = -1;

        } else if (p1 != null && p2 == null){

            result = 1;

        } else if(p1 == null && p2 == null){

            result = 0;

        } else if (lNamep1.equals(lNamep2)) {

            String fNamep1 = p1.getFirstName();
            String fNamep2 = p2.getFirstName();

            result = fNamep1.compareTo(fNamep2);

        } else if (!lNamep1.equals(lNamep2)){
            result = lNamep1.compareTo(lNamep2);
        }

        return result;
    }

}
