/* Angela Tackett CMS141 11FEB2023
 * 
 * This program will provide the user with an annual
 * rental payment increase by 3% over the next 5 years.
 * 
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Week5Discussion {
    public static void main(String [] args){

    //Initialize scanner and decimal format 
    Scanner in = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#,###.##");

    //declare variables
    double rate = .03;
    double add2Rent;

    System.out.println("\nAnnual 3% Rental Increase Calculator\n");
    
    //prompt user for their current payment for rent & rate inquiry
    System.out.print("Enter rent payment: ");
    double rent = in.nextDouble();

    //print statement prior to FOR LOOP for single print
    System.out.println("\nSchedule of Annual Payment Totals\n");
    
    //FOR loop increments year | calculates 3% increase & adds to user rent input
    for (int years = 1; years < 6; years++) {
        add2Rent = rent * rate;
        rent += add2Rent;
        System.out.println((int) years + ": $" + df.format(rent));
        
        in.close();  
  }
 }
}