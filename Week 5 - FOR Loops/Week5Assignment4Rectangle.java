/* Angela Tackett CMIS141 13FEB2023

*/

import java.util.Scanner;

public class Week5Assignment4Rectangle {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a starting number: ");
        int start = input.nextInt();
                
        // Determine the size of the pattern (2 * start - 1) x (2 * start - 1)
        int size = 2 * start - 1;
                
        // Loop through each row and column of the pattern
        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size; y++) {
                 
                // Determine the minimum distance to the edge
                 int distToEdge = Math.min(Math.min(x, size - x - 1), Math.min(y, size - y - 1));
                        
                 // Determine the value to print
                 int value = start - distToEdge;
                        
                 // Output the value followed by a space
                 System.out.print(value + " ");
                    }
                // return carriage
                System.out.println();
                }
            }
        }



    }

}