import java.util.Comparator;
public class ClubNameComparator implements Comparator<Club>{
    private String c1Name;
    private String c2Name;
    private int result = 0;
    public int compare(Club c1, Club c2)
    {
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
