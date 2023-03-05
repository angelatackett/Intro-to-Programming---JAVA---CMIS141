public class AirFryer {
    private String brand;
    private int wattage;
    private boolean isOn;

    public AirFryer(String brand, int wattage) {
        this.brand = brand;
        this.wattage = wattage;
        this.isOn = false;
    }

    public void turnOn() {
        this.isOn = true;
        System.out.println("The " + this.brand + " air fryer is now on.");

    }

    public void fryFood(String foodItem, int cookingTimeInMinutes) {
        if (!this.isOn) {
        	System.out.println("Error: The air fryer is not turned on.");
        	return;
        }
        System.out.println("Frying " + foodItem + " in the " + this.brand 
        + " air fryer for " + cookingTimeInMinutes + " minutes.");
    }


    public void displayStatus() {
        String status = this.isOn ? "on" : "off";
        System.out.println("The " + this.brand + " air fryer has a wattage of "
        + this.wattage + " watts and is currently " + status + ".");
        } 

    public static void main(String[] args) {
        AirFryer myAirFryer = new AirFryer("Ninja", 1500);
        System.out.println();
        myAirFryer.displayStatus();
        myAirFryer.turnOn();
        myAirFryer.displayStatus();
        myAirFryer.fryFood("french fries", 10);
        System.out.println();
    }    

    }
