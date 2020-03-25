import java.util.Comparator;

public class CurrentPresidentComparator implements Comparator<Club>{

    private String lNamep1;
    private String lNamep2;
    private int result;

    public int compare(Club p1, Club p2){


        if (p1 != null && p2 != null) {
            lNamep1 = p1.getCurrentPresident().getLastName();
            lNamep2 = p2.getCurrentPresident().getLastName();
        } else if (p1 == null && p2 != null){

            result = -1;

        } else if (p1 != null && p2 == null){

            result = 1;

        } else if(p1 == null && p2 == null){

            result = 0;

        } else if (lNamep1.equals(lNamep2)) {

            String fNamep1 = p1.getCurrentPresident().getFirstName();
            String fNamep2 = p2.getCurrentPresident().getFirstName();

            result = fNamep1.compareTo(fNamep2);

        } else if (!lNamep1.equals(lNamep2)){
            result = lNamep1.compareTo(lNamep2);
        }

        return result;
    }

}
