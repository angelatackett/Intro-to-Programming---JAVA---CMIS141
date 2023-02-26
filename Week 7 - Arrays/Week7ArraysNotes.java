import java.util.Arrays;
import java.util.Scanner;

class Week7ArraysNotes {
     
    // method to print array
    public static void printArray(int[] a){
        System.out.print("{" + a[0]);
        for (int i = 1; i < a.length; i++) {
            System.out.print(", " + a[i]);
        }
        System.out.println("}");
    }





    public static void main(String []args){

        int[] a = {1, 2, 3, 4};
        
        // [ represents array I int rest storage location
        System.out.println(a); 

        //use array method to print array
        System.out.println(Arrays.toString(a)); 
         
        // called created method
        printArray(a);


        // COPYING ARRAYS *******************
        
        double [] c = new double[3];
        double [] b = c;

        /* effect made to c.array will effect b.array
        b is only referencing c - not copying***
        */
        c[0] = 17;
        System.out.println(b[0]);
 

        // copy example with for loop
        double[] e = new double[3];
        double[] f = new double[e.length];

        for (int i = 0; i < 3; i++) {
            e[i] = f[i];
        }
        System.out.println(Arrays.toString(f));
    } 
}