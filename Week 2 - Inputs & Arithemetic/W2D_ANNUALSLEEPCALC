// Developer: Angela Tackett  CMIS 141  22JAN23
import java.util.*;

public class W2D_ANNUALSLEEPCALC {

	public static void main(String[] args) {

		double sleepHours;
		int daysInWeek = 7;
		int daysInYear = 365;
        
		/* Create Dictionary to show days in each month
		 * LinkedHashMap to keep keys in order of input*/
		Map<String,Integer> d = new LinkedHashMap<>();

        // put() method
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
					
		Scanner in = new Scanner(System.in);
						
		System.out.println("             ***SLEEP CALCULATOR***\n\n"
				+ "This program will take your average nightly amount "
				+ "of sleep and\nprovide you with your average sleep "
				+ "per week, month, and year.\n\n            "
				+ "[NOT INCLUDING LEAPYEARS]");
		
		System.out.print("\nInput average hours per night of sleep you get: ");
		sleepHours = in.nextInt();
		
		System.out.println("\n\n-------------RESULTS----------------"
				+ "\n\nAverage hours of sleep per:\n\n              "
				+ "Week:      " + sleepHours * daysInWeek
				+ "\n              Month:");
		
		for (Map.Entry<String,Integer> entry : d.entrySet())
			System.out.println("                    " 
					+ entry.getKey() + ": " 
					+ entry.getValue() * sleepHours );
		
		System.out.print("\n              Annual:    " 
				+ sleepHours * daysInYear);	 

	}

}
