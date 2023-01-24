import java.util.*;
import java.text.DecimalFormat;
import java.math.RoundingMode;

// developer Angela Tackett CMIS 141 23JAN23

public class ORDERINFOA1W2 {
    	public static void main(String[] args) {
		
		//initialize scanner
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,###.##");
		
		//declare variables
		int customer_id, quantity, disc_cast, disc_percent;
		double unit_price, subtotal,quant_cast, total_discounted;
		String prod_description;
		double discount;
		
		//Instructions for user inputs
		System.out.println("ORDER INSTRUCTIONS \n  "
				+ "After entering inputs "
				+ "press 'enter' or 'return'.\n");
		
		//prompt for customer id + while LOOP ->input type verification
		System.out.print("Enter Customer ID: ");
			while (!scan.hasNextInt()) {
			    System.out.print("Not an integer - re-enter Customer ID:");
			    scan.next();
			}
		customer_id = scan.nextInt();
		
		//prompt for unit price
		System.out.print("Enter unit price (e.g. 3.5): $");
			while (!scan.hasNextDouble()) {
			    System.out.print("Not a decimal - re-enter unit price:");
			    scan.next();
			}
		unit_price = scan.nextDouble();
		
		//prompt for quantity
		System.out.print("Enter quantity: ");
			while (!scan.hasNextInt()) {
				System.out.print("Not an integer - re-enter quantity:");
				scan.next();
			}
		quantity = scan.nextInt();
		
		//prompt for product description
		System.out.print("Enter product description: ");
		prod_description = scan.next();
				
		//prompt for discount
		System.out.print("Enter discount in decimal format (e.g. .10): ");
			while (!scan.hasNextDouble()) {
			    System.out.print("Not a decimal - re-enter discount:");
			    scan.next();
			}
		discount = scan.nextDouble();
				
		
		//ORDER DETAILS PRIOR TO APPLIED DISCOUNT
		quant_cast = (double) quantity;  //type cast for arithmetic operation
		subtotal = unit_price * quant_cast;
		
		disc_cast = (int) discount; //type case for percentage conversion
		disc_percent = (disc_cast * 100);
		// type cast disc_percent to double in order to find actual deducted
				
		System.out.print("\n\nORDER DETAILS\n------------\nCustomer ID: "
				+ customer_id);
		
		//printf format method
		System.out.printf("\nUnit Price: $" + df.format(unit_price)); 
		System.out.print("\nQuantity: "	+ quantity 
				+ "\nProduct Description: " + prod_description
				+ "\nProposed Discount: " + disc_percent + "%");
		
		//printf format method
		System.out.printf("\nSubtotal: $" + df.format(subtotal));
		
	}

}