/*The TeamScoreAnalysis program is a Java console application 
 * that prompts the user to input the number of robotics teams, team names, 
 * and their scores. It then validates the input, calculates and displays 
 * the highest score, lowest score, and the average score of all the teams. 
 * It also assigns grades based on each team's score and displays the scores 
 * and corresponding grades in a table. The program consists of several 
 * methods, each responsible for a specific task, such as finding the index 
 * of the minimum value, maximum value, and average of scores. 
 * DEVELOPER:ANGELA_TACKETT
 * DOD:28FEB2023
 */

import java.util.Scanner;
public class TeamScoreAnalysis {
	
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		// Prompt user for # of and team information----------------------
        System.out.print("\n*** Welcome to the Team Score Analysis Program"
             + "***\n");
		System.out.print("\nEnter number of teams: ");
		int numTeams = in.nextInt();
		
		// initialize separate arrays for team names and scores-----------
		String[] teamNames = new String[numTeams];
		int[] teamScores = new int[numTeams];
		
		// store team names and valid score inputs in arrays--------------
			for (int i = 0; i < teamNames.length; i++) {
			System.out.println("\nTeam " + (i+1) + ": ");
			System.out.print("    Enter team name: ");
			in.nextLine();
			String name = in.nextLine();
			teamNames[i] = name;

			
		// SCORE prompt - start-------------------------------------------
		System.out.print("    Enter team score (400-1000): ");
		int scores = in.nextInt();
		while (true) {  // while loop validates input parameters
			if (scores >= 400 && scores <= 1000) { // validate input range
				teamScores[i] = scores;	
				break; // allows loop to beginning of FOR loop
			} else {  // re-loops WHILE loop
				System.out.println("Invalid Input");
			    System.out.print("Enter team score (400-1000): ");
			    scores = in.nextInt(); // update value of scores
                System.out.println();
			}
		}
		}
		
		// METHOD CALLS ()------------------------------------------------
		int minIndex = MinIndex(teamScores); // smallest index
		int maxValue = MaxValue(teamScores); // largest value
		int maxIndex = MaxIndex(teamScores); // largest index
		double avgScore = Avg(teamScores);   // avg aggregated scores
		char[] grades = Grades(teamScores);  // grade assignments
	
		// Information Display - START -----------------------------------
		System.out.println("\nTotal teams in the competition: " 
				+ numTeams);
		System.out.println();
				
		// SCORE TABLE ---------------------------------------------------
		System.out.printf("%-20s %-10s %-10s\n", "Name", 
        "Score", "Grade");
		for (int i = 0; i < numTeams; i++) {
		    System.out.printf("%-20s %-10d %-10c\n", teamNames[i], 
		    		teamScores[i], grades[i]);
		}
		System.out.println();
		
		
		// DISPLAY high score | low score | average score----------------
		System.out.println("The " + teamNames[maxIndex] 
				+ " have the highest score at " + maxValue);
		System.out.println("The " + teamNames[minIndex]
				+ " have the lowest score at " + teamScores[minIndex]);
		System.out.printf("Total Teams average score is: %.2f",
				 avgScore);
		
		in.close();	
	}
		
	//------------------METHODS()--------------------------------			
	// MinIndex() to find index of smallest value----------------
	public static int MinIndex(int[] A) {
		int minIndex = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] < A[minIndex]) {
				minIndex = i;
			}
		}
		return minIndex;	
	}
	
	// MaxValue() to find largest value--------------------------
	public static int MaxValue(int[] B) {
			int maxValue = B[0];
			for (int i = 1; i < B.length; i++) {
				if (B[i] > maxValue) {
					maxValue = B[i];
				}
			}
			return maxValue;	
	}
	
	// MaxIndex() to find index of largest value-----------------
	public static int MaxIndex(int[] C) {
		int maxIndex = 0;
		for (int i = 0; i < C.length; i++) {
			if (C[i] > C[maxIndex]) {
				maxIndex = i;
			}
		}
		return maxIndex;	
	}
	
	// Avg() to find average of scores---------------------------
	public static double Avg(int[] D) {
		double total = 0;
		double avg = 0;
		int counter = 0;
		int i;
		for (i = 0; i < D.length; i++) {
			if (D[i] != 0) {
				total = total + D[i];
				counter++;
			}
			avg = (double) total / counter;
		}
		return avg;
	}
	
	// Grades() for conversion team score to letter grade--------
	public static char[] Grades(int[] score) {
		char[] grades = new char[score.length];
				
		for (int i = 0; i < score.length; i++) { 
			if (score[i] >= 900) {
				grades[i] = 'A';
			} else if (score[i] >= 800 && score[i] <900) {
				grades[i] = 'B';
			} else if (score[i] >= 700 && score[i] < 800) {
				grades[i] = 'C';
			} else if (score[i] >= 600 && score[i] < 700) {
				grades[i] = 'D';
			} else if (score[i] < 600) {
				grades[i] = 'F';
		}
			
		} 		return grades;
	}
}

