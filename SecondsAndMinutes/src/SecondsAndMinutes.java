public class SecondsAndMinutes {

    public static void main(String[] args) {
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3660));
    }
    private static String getDurationString(int minutes, int seconds){
        //Validate parameters
        if(!(minutes >=0)) return "Invalid value";
        else if (!((seconds >= 0))&&(seconds <= 59)) return "Invalid value";

        int reminderMinutes = minutes % 60;
        minutes -= reminderMinutes;
        int hours = minutes/60;
        String hoursString = hours + "h ";
        if (hours<10) hoursString = "0"+hoursString;
        String minutesString = reminderMinutes + "m ";
        if (reminderMinutes<10) minutesString = "0"+minutesString;
        String secondsString = seconds + "sh";
        if (seconds<10) secondsString = "0"+secondsString;

        return hoursString+minutesString+secondsString;
    }
    private static String getDurationString(int seconds){
        if(!(seconds >= 0)) return "Invalid value";
        int reminderSeconds = seconds%60;
        seconds -= reminderSeconds;
        return getDurationString(seconds/60,reminderSeconds);
    }
}
/*
* Create a method called getDurationString with two parameters, first parameter minutes and 2nd parameter seconds.

You should validate that the first parameter minutes is >= 0.

You should validate that the 2nd parameter seconds is >= 0 and <= 59.

The method should return Invalid value in the method if either of the above are not true.

If the parameters are valid then calculate how many hours minutes and seconds equal the minutes and seconds passed to this method and return that value as string in format gXXh YYm ZZsh where XX represents a number of hours, YY the minutes and ZZ the seconds.

Create a 2nd method of the same name but with only one parameter seconds.

Validate that it is >= 0, and return Invalid value  if it is not true.

If it is valid, then calculate how many minutes are in the seconds value and then call the other overloaded method passing the correct minutes and seconds calculated so that it can calculate correctly.

Call both methods to print values to the console.*/