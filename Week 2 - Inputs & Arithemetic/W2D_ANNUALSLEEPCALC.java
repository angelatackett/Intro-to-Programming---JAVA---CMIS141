/* Developer: Angela Tackett  CMIS 141  22JAN23
This program will prompt user for avaerage amount
of sleep per night and return calculation of average
sleep per week, month and year - not to include leapyear.*/

import java.util.*;

public class W2D_ANNUALSLEEPCALC {

	public static void main(String[] args) {

		//declare variables
		double sleepHours;
		int sleepInWeek, hoursOfSleep; 
		int sleepInYear; 
		final int daysInWeek = 7;
		final int daysInYear = 365;
        
		//initialize Scanner
		Scanner in = new Scanner(System.in);

		/* Create Dictionary to show days in each month
		 * LinkedHashMap to keep keys in order of input*/
		Map<String,Integer> d = new LinkedHashMap<>();

        // dictionary .put() method {key: month | value: days in month}
        d.put("JAN", 31);
        d.put("FEB", 28);
        d.put("MAR", 31);
        d.put("APR", 30);
        d.put("JUN", 30);
        d.put("JUL", 31);
        d.put("AUG", 31);
        d.put("SEP", 30);
        d.put("OCT", 31);
        d.put("NOV", 30);
        d.put("DEC", 31);
        //System.out.print(d+"\n"); //<<UNCOMMENT System.out to display dict

		// program instructions				
		System.out.println("             ***SLEEP CALCULATOR***\n\n"
				+ "This program will take your average nightly amount "
				+ "of sleep and\nprovide you with your average sleep "
				+ "per week, month, and year.\n\n            "
				+ "[NOT INCLUDING LEAPYEARS]");
		
		// prompt for user input
		System.out.print("\nInput average hours per night of sleep you get: ");
		sleepHours = in.nextInt();
		
		//type cast to convert double to int
		hoursOfSleep = (int) sleepHours;  //double to int
		sleepInWeek = hoursOfSleep * daysInWeek; //"
		sleepInYear = hoursOfSleep * daysInYear; //"
	
		//return calculations for per week
		System.out.printf("\n\n-------------RESULTS----------------"
				+ "\n\nAverage hours of sleep per:\n\n              "
				+ "Week:      %,d", sleepInWeek);
		System.out.print("\n              Month:\n");
		
		/*loops through each {k:v} and multiplies 
		against user input for monthly sleep averages*/
		for (Map.Entry<String,Integer> entry : d.entrySet())
			System.out.printf("                    " 
					+ entry.getKey() + ": " 
					+ entry.getValue() * sleepHours + "\n");
		
		//sum of months for annual average sleep calculation
		System.out.printf("\n              Annual:    %,d", 
				sleepInYear);	 

				in.close();

	}

}
