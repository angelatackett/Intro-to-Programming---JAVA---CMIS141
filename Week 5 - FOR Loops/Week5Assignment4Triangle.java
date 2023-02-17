/* Angela Tackett CMIS141 14FEB2023

Program takes user's input and creates a
progressive right triangle pattern increasing
rows until input number is reached utilizing
nested for-loops.
*/

import java.util.Scanner;

public class Week5Assignment4Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int rows;
        
        do {
        System.out.print("Enter desired number of rows [3 or more]: ");
        rows = in.nextInt();
        } while (rows < 3);

        for (int i = 1; i <= rows; i++) {
            for (int t = 1; t <= i; t++) {
                System.out.print(t + " ");
            }
            System.out.println();
       
            in.close();
            }    
     }
}