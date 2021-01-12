public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces (double a, double b){
        a = (long) ( a * 1000d);
        b = (long) ( b * 1000d);
        if (a==b){
            return true;
        }else{
            return false;}
    }
}
