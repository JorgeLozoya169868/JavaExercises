public class TeenNumberChecker {
    /*
    * We'll say that a number is "teen" if it is in the range 13-19 (inclusive)
    *  Method named hasTeen with 3 parameters int
    * return boolean
    * it's true if one of the parameters is in the range 13 - 19
    * otherwise false    * */
    public static boolean hasTeen(int a, int b, int c){
        if((a>=13 && a<=19)||(b>=13 && b<=19)||(c>=13 && c<=19))return true;
        else return false;
    }
    public static boolean isTeen(int value){
        if(value>=13 && value<=19){
            return true;
        }
        else return false;
    }
}
