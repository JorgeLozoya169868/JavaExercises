public class Overloading {
    public static void main(String[] args) {
        int newScore = calculateScore("Jorge",500);
        System.out.println("New score is "+newScore);
        calculateScore(75);
        calculateScore();
        System.out.println("CM:"+calcFeetAndInchesToCentimeters(70));
    }
    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName+" scored " + score + " points");
        return score *1000;
    }
    public static int calculateScore(int score){
        System.out.println("Unnamed player scored " + score +" points");
        return score * 1000;
    }
    public static int calculateScore(){
        System.out.println("No player name, no player score");
        return 0;
    }

    //Challenge Overloading
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(!(feet >=0)) return -1;
        else if (!((inches >= 0)&&(inches <=12))) return -1;
        // System.out.println("Pass");
        // System.out.println("feeT:"+feet+" Inches:"+inches);
        return 2.54*((feet*12)+(inches));
    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if(!(inches >= 0)) return -1;
        double remainderInches = inches%12;
        inches -= remainderInches;
        double feet = inches/12;
        //System.out.println("FEET: "+feet+"INCHES:"+remainderInches);
        return calcFeetAndInchesToCentimeters(feet, remainderInches);
    }

}
