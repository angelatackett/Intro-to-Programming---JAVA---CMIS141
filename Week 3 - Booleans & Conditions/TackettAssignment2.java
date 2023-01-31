/* 
Developer Angela Tackett
CMIS 141 30JAN2023 Assignment 2
------------------------------------
This program prompts the user for two
different numbers within a specified range 
and a mathematical operation symbol to perform
requested function utilizing a switch.

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
             + "[separate numbers with a 'space']: ");
        no_1 = no.nextInt();
        no_2 = no.nextInt();

        // while loop ensures inputs are within allowed range
        while (true) {
            if (no_1 < 200 || no_1 > 1000) {
                System.out.println("Invalid Range");
                System.out.print("Enter two numbers from 200 to 1000 \n"
                +   "[separate numbers with a 'space']: ");
                no_1 = no.nextInt();
                no_2 = no.nextInt();
            } else if (no_2 < 200 || no_2 > 1000) {
                System.out.println("Invalid Range");
                System.out.print("Enter two numbers from 200 to 1000 \n"
                +   "[separate numbers with a 'space']: ");
                no_1 = no.nextInt();
                no_2 = no.nextInt();             
            } else {
                break;
            }
        }   
        // prompt for mathematical operation input
        System.out.print("Enter one of the following mathematical operation symbols"
         + "\n[ + - * /] : ");
        mathFunc = no.next().charAt(0); //read single char input


        // switch
        switch (mathFunc) {

        case '+' : compute = no_1 + no_2;
            System.out.print(no_1 + " + " + no_2 + " = " + compute);
            break;
        case '-' : compute = no_1 - no_2;
            System.out.print(no_1 + " - " + no_2 + " = " + compute);
            break;
        case '*' : compute = no_1 * no_2;
            System.out.print(no_1 + " * " + no_2 + " = " + compute);
            break;
                    // [below] type cast int to double to bypass int division [drops remainder]                
        case '/' : compute = (double) no_1 / (double) no_2; 
            System.out.print(no_1 + " / " + no_2 + " = " + compute);
            break;
        default  : System.out.print("Error - invalid operation input."); 
        } no.close();         
    }
}