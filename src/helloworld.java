/** A Java program to display the message
 * "Hello World!" on standard output
 * and complete CMIS 141 Week 1 exercises.
 * Developer : A_Tackett
 */

 public class helloworld {

	public static void main(String[] args) {
		
		String HW = "Hello, World!";
		System.out.println(HW + "\n");

		//		Excercise 1 - Week 1
		String name = "Jon Smith";
		System.out.println(name + "\n");

		//		Excercise 2 - Week 1
		String bookTitle = "Black Dawn";
		int    bookPages = 567;
	    double bookPrice = 9.99;
	    
	    System.out.println("Book Title:\"" + bookTitle
	    		+ "\" Number of pages: " + bookPages
	    		+ " Price: $" + bookPrice + "\n");
	    
	    //		Excercise 3 - Week 1
	    boolean earnInterest = true;
	    int     acctID = 56789;
	    String  acctOwner = "Jane Jones";
	    double  acctBalance = 567.45;
	    
	    System.out.print("Account Information:\n\t owner="
	    		+ acctOwner + " id=" + acctID 
	    		+ "\n\t balance=" + acctBalance 
	    		+ " earn interest=" + earnInterest);
	    	    
	} // end of method

} //end of class hello_world
