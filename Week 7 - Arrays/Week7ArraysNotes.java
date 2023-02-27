import java.util.Arrays;
import java.util.Random;

class Week7ArraysNotes {
     
    // method to print array
    public static void printArray(int[] a){
        System.out.print("{" + a[0]);
        for (int i = 1; i < a.length; i++) {
            System.out.print(", " + a[i]);
        }
        System.out.println("}");
    }

    // RANDOM # ARRAY METHOD
    public static int[] randomArray(int size) {
        Random random = new Random();
        int [] a = new int [size];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
        return a;
    }

    // TWO INTEGERS RETURNS ELEMENTS FROM LOW TO HIGH -1
    public static int inRange(int[] a, int low, int high) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= low && a[i] < high) {
                count++;
            }
        }
        return count;
    } 


    public static void main(String []args) {

        int[] a = {1, 2, 3, 4};
        
        // [ represents array I int rest storage location
        System.out.println("Printing the array variable only\n"
            + a + "\n[ represents array and I for int\n"
            + "followed by storage location."); 

        //use array method to print array
        System.out.println("\nPrint array with java.util.Arrays method\n"
            + Arrays.toString(a)); 
         
        // called created method
        System.out.println("\nCalling composed method");
        printArray(a);


        // COPYING ARRAYS *******************
        
        double [] c = new double[3];
        double [] b = c;

        /* effect made to c.array will effect b.array
        b is only referencing c - not copying***
        */
        c[0] = 17;
        System.out.println("\nReferenced array - not copied\n"
            + b[0]);
 

        // copy example with for loop
        double[] e = new double[3];
        double[] f = new double[e.length];

        for (int i = 0; i < 3; i++) {
            e[i] = f[i];
        }
        System.out.println("\nCopy with FOR Loop\n"
            + Arrays.toString(f));


        // java.util.Arrays provides a copyOf()
        double [] g = new double[3];

            // arg (array, length of indexes requested)
        double[] h = Arrays.copyOf(g, g.length);
        System.out.println("\nCopy w/ arrray.length argument\n"
            + Arrays.toString(h));
    

        // TRAVERSING ARRAYS
        int[] j = {1, 2, 3, 4, 5};
       
        for (int k = 0; k < j.length; k++) {
            j[k] *= j[k]; //returns squares
        }
        System.out.println("\nTraversing Arrays\n" 
            + Arrays.toString(j));

            
        // SEARCH - traverse an array and SEARCH
        //takes an array and value, returns index where value appears

        // public static int search(double[] array, double target) {
        //     for (int i = 0; i < array.length; i++) {
        //         if (array[i] == target) {
        //             return i;
        //         }
        //     }
        //     return -1; // not found - value chosen to indicate a failed search
            // essentially String.indexOf for arrays

        
        // RANDOMIZATION
        int [] arrayEx = randomArray(10);
        System.out.println("\nRandom number array fill");
        printArray(arrayEx);  // could use Arrays.toString() but this returns curly brackets
            

        // ENHANCED FOR LOOP
        
        // for (int value : values) {
        //    System.out.println(value);
        // }      // see HistogramBuildJava.java  


    
    }

} 