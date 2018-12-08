package Class12;

public class Time
{
     private int hour;
     private int minute;     
     
     /* Complete required constructors and methods here */
     
     /*
      *Default constructor that sets time to 1200.  
      */ 
     public Time()
     {
     }
     
     /*
      * If h is between 1 and 23 inclusive, set the hour to h. 
      * Otherwise, set the hour to 0. If m is between 0 and 59 inclusive, 
      * set the minutes to m. Otherwise, set the minutes to 0. 
      */ 
     public Time(int hour, int minute)
     {
       this.hour = hour;
       this.minute = minute;
       if (this.hour > 23 || this.hour < 1) this.hour = 0;
       if (this.minute > 59 || this.minute < 0) this.minute = 0;
     }
     
     /* Returns the time as a String of length 4 in the format: 0819. 
      * Notice that if the hour or minute is one digit, it should 
      * print a zero first. For example, 6 should print as 06.
     */
     public String toString()
     {
    	 String hours, minutes;
    	 if (hour >= 0 && hour <= 9)hours = "0"+hour;
    	 else hours = ""+hour;
    	 if (minute >= 0 && minute <= 9)minutes = "0"+minute;
    	 else minutes = ""+minute;
    	 return hours+minutes;
    	
     }
     
     /*
      * Returns the time as a String converted from military time 
      * to standard time. For example, 0545 becomes 5:45 am and 
      * 1306 becomes 1:06 pm.
      */ 
     public String convert()
     {
    	 String minutes;
    	 if (minute <= 9) minutes = "0"+minute;
    	 else minutes = "" + minute;
    	 if (hour > 12) return (hour-12) + ":" + minutes + " pm";
    	 else if (hour == 0) return "12:" + minutes + " am";
    	 else if (hour == 12) return "12:" + minutes + " pm";
    	 else return hour + ":" + minutes + " am";
     }
     
    /*
     * Advances the time by one minute. 
     * Remember that 60 minutes = 1 hour. 
     * Therefore, if your time was 0359, and you add one minute, 
     * it becomes 0400. 2359 should increment to 0000.
     */ 
    public void increment()
    {
      minute += 1;
      if (minute == 60) {
    	  minute -= 60;
    	  hour += 1;
      }
      if (hour == 24) hour = 0;
    }
      
}