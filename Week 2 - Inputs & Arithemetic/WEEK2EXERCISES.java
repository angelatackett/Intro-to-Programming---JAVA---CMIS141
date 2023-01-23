import java.util.*;  //import util for Scanner

public class WEEK2EXERCISES {
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
            System.out.print("Enter a number: ");  
            //assign input to variable              
            no_1 = in.nextInt();                                   

            System.out.print("Enter another number: ");         
            no_2 = in.nextInt();                                  

            //compute variables and assign
            result = no_1 * no_2;         
            
            //print results -- formatted to include comma utilizing format specifier : %,d
            System.out.printf("Result of sum: %,d", result);

    }
    
}
