import java.util.Scanner;
public class TimeFormatter {
    
    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Seconds: ");
            int num = scan.nextInt();
            System.out.println(formatDuration(num));
        }
    }
    
    
    public static String formatDuration(int seconds) {
      String output = "";
      if (seconds >= 60)  {
        int minutes = seconds/60;
        seconds = seconds % 60;
        output = tadd("seconds", seconds, output);
        output = tadd("minutes", minutes%60, output);
        if (minutes >= 60)  {
          int hours = minutes/60;
          output = tadd("hours", hours%60, output);
          if (hours >= 24)  {
            int days = hours/24;
            output = tadd("days", days%365, output);
            if (days >= 365)  {
              int years = days/365;
              output = tadd("years", years, output);
            }
          }
        }
      }
      else {return Integer.toString(seconds) + " second";}
      output = output.replaceFirst(", ", "");
      output = output.substring(0, output.lastIndexOf(", ")) + " and " + output.substring(output.lastIndexOf(", ")+2);
      System.out.println(output);
      return output;
    }
  public static String tadd(String meas, int amount, String output) {
      if (amount > 1) {return ", " + Integer.toString(amount) + " " + meas + output;}
        else if (amount==0) {}
        else {return ", " + "1 " + (meas.replaceAll("s", "")) + output;}
    return "";
    } 
}