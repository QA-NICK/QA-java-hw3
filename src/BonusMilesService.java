public class BonusMilesService {
    public int calculate ( int cost ) {
        int bonusCost = 20;
        int miles = cost / bonusCost;
        System.out.println(miles);
     return miles;
    }
}
