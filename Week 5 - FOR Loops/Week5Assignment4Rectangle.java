/* Angela Tackett CMIS141 14FEB2023

Program takes user's input and creates a rectangular pattern
with outer shell starting with user's input and decrementing
down to the number 1 in the center. Single digit inputs are
ideal to maintain clean pattern, but various digit inputs
will still be accepted. FOR SCIENCE! Code utilizes nested
for-loops to achieve pattern.
*/

import java.util.Scanner;

public class Week5Assignment4Rectangle {

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int start;

        System.out.println("SINGLE DIGIT INPUTS WORK BEST!\n");
        
        // do-while loop keeping user prompted until input > 1
        do {
        System.out.print("Enter desired start number [>1]: ");
        start = in.nextInt();
        } while (start < 2);
        
        // Declaire pattern (2 * start - 1) x (2 * start - 1)
        int size = 2 * start - 1;
                
        // Loop through each row and column of the pattern
        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size; y++) {
                 
                //calculate minimum distance to the edge
                 int dist = Math.min(Math.min(x, size - x - 1), Math.min(y, size - y - 1));
                        
                 //value to print
                 int value = start - dist;
                        
                 //output formatted with space
                 System.out.print(value + " ");
                    }
                // return carriage
                System.out.println();
                in.close();
                }
            }
        }