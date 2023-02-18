/* Developer: Angela Tackett CMIS 141 18FEB2023
*** INSULIN INFORMATION GENERATOR ***
This program prompts the user for the number of times
they have tested their blood glucose levels. It prompts
for the individual measurements and provides the number
of units of insulin that each measurement requires. The 
program wraps up by providing the total amount of blood
glucose the user has measured for today, the total
recommended units of insulin, and the average amount
of insulin recommended for use throughout the day. 
*/

import java.util.Scanner;

public class Week6Disc {

        // method providing recommended units of insulin to blood glucose measurement
	    public static int insulinUnits(int bloodGlucose) { 

	        int insulinUnits = 0;

	        //insulin units to glucose level parameters
	        if (bloodGlucose <= 150) {
	            insulinUnits = 0; 
	        } else if (bloodGlucose >= 151 && bloodGlucose <= 200) {
	            insulinUnits = 3;
	        } else if (bloodGlucose >= 201 && bloodGlucose <= 250) {
	            insulinUnits = 5;
	        } else if (bloodGlucose >= 251 && bloodGlucose <= 300) {
	            insulinUnits = 8;
	        } else if (bloodGlucose >= 301 && bloodGlucose <= 350) {
	            insulinUnits = 10;
	        } else if (bloodGlucose >= 351 && bloodGlucose <= 400) {
	            insulinUnits = 12;
	        } else if (bloodGlucose > 400) {
	            insulinUnits = 15;
	        };
	        
	        return insulinUnits;
	    }

        // method calculating average units of insulin based on user inputted measurements
	    public static int avgInsDay(int totInsulinUnits, int perDay){
	        
            // calculates average units of insulin for day
	        int avgInsDay = (totInsulinUnits / perDay);

	        return avgInsDay;
	    }

	    
	    public static void main(String [] args){

            // initialize scanner and declare variables
	        Scanner in = new Scanner(System.in);
	        int perDay = 0;
	        int bloodGlucose =0;
	        char answer;
            String name;

            System.out.print("\nPlease enter your name: ");
            name = in.next();

            // do-while prompting for glucose test execution while validating user input via if statement
	        do {
	            System.out.print("\nDid you measure your blood glucose level today [Y or N]? ");
	            answer = in.next().charAt(0);
	                // Check user response
                    if (answer == 'N' || answer == 'n'){ //user says no, exit loop
                        System.out.print("Goodbye!");
                        System.exit(0);
            }} while (answer != 'N' && answer != 'n' && answer != 'Y' && answer != 'y'); 

            // do-while validating user input as positive int
            do {
                System.out.println();
                System.out.print("How many times have you tested today? ");
                perDay = in.nextInt();
            } while (perDay < 1);  

            // declare more variables
	        int count = 1;
	        int totBloodGlucose = 0;
	        int totInsulinUnits = 0;
	        int insulinUnits =0;
            int avgIns = 0;
	        
            /* Prompts user for measurements based on the number of times user tested | 
            displays input | calls insulinUnit() method to retrieve and display recommended 
            insulin units based on prior input | stores user glucose inputs & retrieved 
            insulin recommendations for each loop */
	        while (count <= perDay){
                System.out.println();
                System.out.print("Enter blood glucose measurement (mg/dL): ");
	            bloodGlucose = in.nextInt();
	            System.out.println("\n\nMeasurement " + count + ": " + bloodGlucose);
	            insulinUnits = insulinUnits(bloodGlucose);
	            System.out.println("Units of insulin recommended: " + insulinUnits);
	            totBloodGlucose += bloodGlucose;
	            totInsulinUnits += insulinUnits;
	            count++;
	        }

            // calculate avgerage insulin outside of loop
            avgIns = avgInsDay(totInsulinUnits , perDay);


            // displays user's name, stored glucose and insulin totals, and avg insulin units
            System.out.println();
            System.out.println("-----------------------------------");
            System.out.println(name + "'s Blood Glucose Info");
            System.out.println("\nTotal Blood Glucose: " + totBloodGlucose);
            System.out.println("Total Units of Insulin: " + totInsulinUnits);
	        System.out.println("Average units of insulin: " + avgIns);
            System.out.println();
	            
	        in.close();
	    }

}


