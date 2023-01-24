import java.util.*;  //import util for Scanner

public class WEEK2EXERCISES {
        /**
         * @param args
         */
        public static void main(String[] args){

            /* Exercise 1 - Program which prompts user for two numbers,
             * multiplies them together and prints the result to the 
             * console */

            // Ex. 1
            Scanner in = new Scanner(System.in);   //initialize scanner
            int no_1;                              //declare variables
            int no_2;
            int result;

            //prompt user for input
            System.out.print("Exercise 1\n\nEnter a number: ");  
            //assign input to variable              
            no_1 = in.nextInt();                                   

            System.out.print("Enter another number: ");         
            no_2 = in.nextInt();                                  

            //compute variables and assign
            result = no_1 * no_2;         
            
            //print results -- formatted to include comma utilizing format specifier : %,d
            System.out.printf("Result of sum: %,d", result);



            /* Exercise 2 - Program which prompts user for two integers,increments
            them by one and prints each on a separate line to the console */

            int n1, n2, n3, n4;
            System.out.println("\n\nExercise 2\n\nEnter Two Numbers" 
               + "(Press enter after each):");
            n1 = in.nextInt();
            n2 = in.nextInt();
            n3 = ++n1;  //increment
            n4 = ++n2;  //increment
            System.out.print("\n" + n3 + "\n" + n4);

        }
    
}
