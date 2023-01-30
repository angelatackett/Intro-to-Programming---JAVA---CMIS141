/* 
Developer Angela Tackett
CMIS 141 30JAN2023 Assignment 2
------------------------------------
This program prompts the user for two
different numbers and a mathematical operation
symbol to perform requested function utilizing 
a switch.

It provides valid inputs along with results or
otherwise displays an error message.
*/

import java.util.Scanner;

public class TackettAssignment2 {

    public static void main(String args[]) {

         //init scanner
        Scanner no = new Scanner(System.in);
        
        // establish variables
        int no_1, no_2;
        char mathFunc;
        double compute;

        // prompt user | declare variables from int inputs
        System.out.print("Enter two numbers from 200 to 1000 \n"
                +   "[separate numbers with a 'space']: ");
        no_1 = no.nextInt();
        no_2 = no.nextInt();
        
        // prompt for mathematical operation input
        System.out.print("Enter one of the following mathematical operation symbols"
         + "\n[ + - * /] : ");
        mathFunc = no.next().charAt(0); //read single char input

        switch (mathFunc) {

        case '+' : compute = no_1 + no_1;
            System.out.print(no_1 + " + " + no_2 + " = " + compute);
            break;
        case '-' : compute = no_1 - no_1;
            System.out.print(no_1 + " - " + no_2 + " = " + compute);
            break;
        case '*' : compute = no_1 * no_1;
            System.out.print(no_1 + " * " + no_2 + " = " + compute);
            break;
        case '/' : compute = (double)no_1 % no_1;
            System.out.print(no_1 + " / " + no_2 + " = " + compute);
            break;
        default  : System.out.print("Error - invalid input."); 
        }


        


    
    }
}