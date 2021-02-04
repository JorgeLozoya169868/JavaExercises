public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes){
        if (minutes < 0) System.out.println("Invalid Value");
        else{
            long reminderMinutesToDays = minutes%1440;
            long day = (minutes-reminderMinutesToDays)/1440;
            long reminderDaysToYear = day %365;
            long year = (day - reminderDaysToYear)/365;
            System.out.println(minutes+" min = "+year+" y and "+reminderDaysToYear+" d");
        }
    }
}
