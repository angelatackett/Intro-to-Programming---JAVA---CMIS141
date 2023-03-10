/* Developer: Angela Tackett CMIS 141
 *            29JAN2023
 * This program will determine if the
 * inputted glucose level is considered
 * hypoglycemic || healthy || pre-diabetic 
 * || hyperglycemic (diabetic) 
 * */

 import java.util.Scanner;

public class FastingGlucoseLevelCheck {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in); // scanner initialize
				
		System.out.println("Fasting Glucose Level (FGL) Checker"); // program title  
		
		System.out.print("\nEnter fasting glucose level (0 or greater): ");
		int glucLevel = in.nextInt();
		
		while (glucLevel < 0) {
			System.out.print("Please enter a valid FGL input: ");
			glucLevel = in.nextInt();
			//break; // break while loop - no break creates infinite loop if [commented out]
			} 
			
			if (glucLevel <= 70) {
				System.out.println("FGL considered HYPOGLYCEMIC!\n"
						+ "SEEK MEDICAL ATTENTION NOW!");			
			} else if (glucLevel >= 70 && glucLevel < 100) {
				System.out.println("FGL considered HEALTHY!");
			} else if (glucLevel >= 101 && glucLevel <= 125) { 
				System.out.println("FGL considered PREDIABETIC!");
			} else if (glucLevel >= 70 && glucLevel <= 125) { 
				System.out.println("FGL considered PREDIABETIC!");	
			} else if (glucLevel >= 126) {
				System.out.println("FGL considered HYPERGLYCEMIC!"
						+ "\nSEEK MEDICAL ATTENTIONS!");
			in.close();
		}
	}
}
