/* Developer: Angela Tackett
CMIS 141 - Intro to Programming 04MAR23

This program models an air fryer appliance using 
an AirFryer class. The class has three attributes: 
String brand, int wattage, and boolean isOn, and three methods: 
turnOn(), fryFood(String foodItem, int cookingTimeInMinutes), 
and displayStatus().The turnOn() method turns on the air fryer, 
the fryFood() method simulates frying a food item in the air fryer
for a specified amount of time, and the displayStatus() method 
displays the brand name, wattage, and whether the air fryer is 
currently on or off.The main() method creates an instance of the 
AirFryer class and calls its methods to demonstrate its functionality.
It can be used as a starting point for modeling other 
household appliances in Java.*/

public class AirFryer {
	// Declare instance variables
    private String brand;
    private int wattage;
    private boolean isOn;

    // Constructor
    public AirFryer(String brand, int wattage) {
        this.brand = brand;
        this.wattage = wattage;
        this.isOn = false;
    }
    
    // turnOn() method - turn on Air Fryer when called
    public void turnOn() {
        this.isOn = true;
        System.out.println("The " + this.brand + " air fryer is now on.");
    }
    
    // fryFood() method provides status if 'off' or food and cook time if on
    public void fryFood(String foodItem, int cookingTimeInMinutes) {
        if (!this.isOn) {
        	System.out.println("Error: The air fryer is not turned on.");
        	return;
        }
        System.out.println("Frying " + foodItem + " in the " + this.brand 
        + " air fryer for " + cookingTimeInMinutes + " minutes.");
    }

    /* displayStatus() method uses ternary operator to assign string value based
     * on boolean condition status*/
    public void displayStatus() {
        String status = this.isOn ? "on" : "off";
        System.out.println("The " + this.brand + " air fryer has a wattage of "
        + this.wattage + " watts and is currently " + status + ".");
        } 

    // main() method creates instance of AirFryer
    public static void main(String[] args) {
    	// Creates object with brand and wattage arguments
        AirFryer myAirFryer = new AirFryer("Ninja", 1500);
        
        // Displays static status - - constructor static condition - false 'off'
        myAirFryer.displayStatus();
        
        // Turns on Air Fryer
        myAirFryer.turnOn();
        
        // Displays power status
        myAirFryer.displayStatus();
        
        // Displays food and cook time
        myAirFryer.fryFood("french fries", 10);
    }    

}
