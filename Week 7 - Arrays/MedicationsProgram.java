/*Developer: Angela Tackett
 * CMIS 141 27feb2023
 */

public class MedicationsProgram {
    public static void main(String[] args) {
        
        // Declare and populate an array of medications
        String[] medications = {"Aspirin", "Ibuprofen", "Paracetamol", "Codeine", "Morphine"};

        // Call the modifyArray method to modify the medications array
        modifyArray(medications);

        // Display the modified array contents to the console using an enhanced for loop
        System.out.println("\nMake note of following modified medication and adhere to proper instructions.\n");
        System.out.println("Modified Medications:");
        for (String medication : medications) {
            System.out.println(medication);
        }
    }

    // Method to modify the values of an array of medications
    public static void modifyArray(String[] medications) {
        // Loop through the array and append " (MODIFIED)" to each medication name using an enhanced for loop
        for (int m = 0; m < medications.length; m++) {
            medications[m] += " (MODIFIED)";
        }
    }
}