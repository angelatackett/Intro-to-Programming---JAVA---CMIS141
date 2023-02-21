/** Developer: Angela Tackett
 * CMIS 141 20FEB2023 ASSIGNMENT5
 * This program prompts the user for a desired conversion action
 * [Cubic Ft to US Bushel | Miles to Kilometers | Graduate GPA Title].
 * By creating local methods to perform the conversions, it allows for
 * the implementation and possible various implementations without the
 * need for repeat code composition. 
 */


 import java.util.Scanner;

 public class ConversionCrusher {
 
     
      // cubic feet to U.S. bushel method ---------------------|
     public static double cubicToBushel (double cubic_feet) {
         
         double multiplier = 0.80357142857143;
         double bushel = (cubic_feet * multiplier);
             
         return bushel;
     }
     
     // miles to kilometers method----------------------|
     public static double miles2Kilos (double miles) {
         
         double kilo = 1.6;
         double totalKilos = (miles * kilo);
         
         return totalKilos;
     }
     
     // graduate with honors title determination method--|
     public static String gradHonors (double gpa) {
         
         String honor;
         
         // titles based on student graduate GPA
         if (gpa >= 4.0){
             honor = "Summa cum laude";
         } else if (gpa >= 3.8 && gpa <= 3.9){
             honor = "Magna cum laude";
         } else if (gpa >= 3.5 && gpa <= 3.7){
             honor = "Cum laude";
         } else {
             honor = "Invalid GPA";
         }
         
         return honor;
     }	
     
     
     //-----------------------------------//
     //          Program Start
     public static void main(String[] args) {
         
         // initialize scanner and declare variables
         Scanner in = new Scanner(System.in);
         double cubic_ft = 0;
         double miles = 0;
         char input;
         String honor;
         
         // user inputs character correlating to desired conversion
         while (true) {	
             System.out.println("\tCONVERSION CRUSHER\n");
             System.out.println("Enter desired conversion:\n");
             System.out.print("A. Cubic Feet to U.S. Bushels Conversion \n"
                     + "B. Miles to Kilometers Conversion\n"
                     + "C. Graduation Honors by GPA\n"
                     + "D. EXIT PROGRAM");
             System.out.print("\n\nEnter here ->: ");
             input = in.next().charAt(0); // user input
                 
             // switch statement for input validity
                 switch (Character.toUpperCase(input)) {  // uppercase for runtime efficiency (A vs. A&a validation)
                     
                     // Option A 
                     case 'A':              
                         System.out.print("Enter cubic feet: ");
                         cubic_ft = in.nextDouble();
                         double bush = cubicToBushel(cubic_ft);
                         System.out.printf("%.3f cubic feet comes out to %.3f U.S. Bushels.", cubic_ft, bush);	
                             break;
                     
                     // Option B
                     case 'B':
                         System.out.print("Enter miles: ");
                         miles = in.nextDouble();
                         double kilometers = miles2Kilos(miles);
                         System.out.printf("%.2f miles comes out to %.2f kilometers", miles, kilometers);
                             break;
                     
                     // Option C - GPA to GRAD TITLE 
                     case 'C':
                         System.out.print("Enter GPA: ");
                         // if statement ensures double or int -> double input conversion (if required)
                         if (in.hasNextInt()) {
                             int gpa = in.nextInt();
                             double gpa2 = (double) gpa;
                             honor = gradHonors(gpa2);
                                 if (gpa < 1 || gpa > 5) {
                                     System.out.print("Does not compute.\n");
                                     break;
                                 } // ends program if outside gpa parameters
                             System.out.printf("\n%.1f gpa comes out to honor grad title: %s", gpa2, honor);						
                             System.out.println();
                                 break;
                         } else if (in.hasNextDouble()) {
                             double gpa = in.nextDouble();
                             honor = gradHonors(gpa);
                                 if (gpa < .1 || gpa > 4.9) {
                                     System.out.print("Does not compute.\n");
                                     break;
                                 } // ends program if outside gpa parameters
                             System.out.printf("\n%.1f gpa comes out to honor grad title: %s ", gpa, honor);
                             System.out.println();
                                 break;
                         }
                     
                     // Option D - EXIT PROGRAM
                     case 'D':
                         System.out.print("\nGood Bye!");
                         System.exit('D');
                         
                 }	
         break; // Keep loop from reiterating with accepted inputs
                         
     
             }
             in.close();
         }	
 
     }
 