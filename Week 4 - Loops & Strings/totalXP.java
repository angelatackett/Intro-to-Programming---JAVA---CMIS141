/* Developer Angela Tackett
 * CMIS 141 - Intro to Programming
 * 05 FEB 2023 
 * 
 */

import java.util.Scanner;
import java.lang.Math;

public class totalXP {
    
    public static void main(String [] args){

       int L1 = 0; 
       int L2 = 0;
       int L3 = 0;
       int ES = 2; // declared at 2 as increment starting point
       String g_name;
       String nextPlayer;
       
       Scanner in = new Scanner(System.in);

        do {
              // user inputs name at prompt
            System.out.print("Enter name ['x' to exit]: ");
            g_name = in.next();
            if (g_name.equals("x")) {
                break;
            }

              // user enters level I XP + ES increments by 1
            do {
                System.out.print("Enter Level 1 XP: ");
                L1 = in.nextInt();
                ES++;
            } while (L1 % 5 != 0 || L1 < 10 || L1 > 100);

              // user enters level II XP + ES increments by 1
            do {
                System.out.print("Enter Level 2 XP: ");
                L2 = in.nextInt();
                ES++;
            } while (L2 % 5 != 0 || L2 < 10 || L2 > 100);
        
              // user enters level III XP + ES increments by 1
            do {
                System.out.print("Enter Level 3 XP: ");
                L3 = in.nextInt();
                ES++;
            } while (L3 % 5 != 0 || L3 < 10 || L3 > 100);

              // calculates total score based on computation guidelines
            double totalScore = ((L1 + (L1 * 0.20)) 
            + (L2 + (L2 * 0.30)) 
            + (L3 + (L3 * 0.50)) 
            + (ES + (ES * 0.60))); 

              // Display individual level XP, sum of ES increments, calc'd total
            System.out.println("/t/t" + g_name);
            System.out.println("----FINAL SCORES----");
            System.out.println();
            System.out.println("    LEVEL 1: " + L1 + " XP");
            System.out.println("    LEVEL 2: " + L2 + " XP");
            System.out.println("    LEVEL 3: " + L3 + " XP");
            System.out.println("      BONUS: " + ES + " XP");
            System.out.println();
            System.out.println("TOTAL SCORE: " + (int) Math.round(totalScore) + " XP");
            System.out.println("---------------------");
            
              // new gamer info prompt
            System.out.print("\nNew gamer info [Y or N]: ");
            nextPlayer = in.next();
                if (nextPlayer.equalsIgnoreCase("Y")) {
                    continue;
                } else if (nextPlayer != "Y" || nextPlayer != "y") {
                    break;
                } else {
                    return;
                }

        } while (g_name != "x");

        in.close();  
        }
    
    }

