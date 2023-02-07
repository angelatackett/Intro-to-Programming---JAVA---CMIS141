import java.util.Scanner;
import java.util.Random;

public class numberGuessRandomizer {
    
    public static void main(String [] args) {

    //Initialize scanner and random methods    
    Scanner in = new Scanner(System.in);
    Random rando = new Random();

    //prompt user to guess number 1 through 10 (inclusive)
    System.out.print("What number am I thinking of (1 - 10)? ");
    
    // declare num variable for input and random number generation limit 1-10
    int num = in.nextInt();
    int randNum = rando.nextInt(1,10);
    
    // compares input to random generated number
    while (num > 0){
        if (num == randNum) {
            System.out.print("\nHOLY SMOKES, YOU GOT IT!");
            break;
        } else if (num != randNum) {
            System.out.println("\n         Guess again, my incorrect friend!\n");
            System.out.print("What number am I thinking of (1 - 10)? ");
            num = in.nextInt();
        }
    }
    in.close();
    }
}
