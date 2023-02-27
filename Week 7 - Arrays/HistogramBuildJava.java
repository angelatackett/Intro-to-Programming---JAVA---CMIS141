import java.util.Random;
import java.util.Arrays;

public class HistogramBuildJava {

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


        public static void main(String[] args) {

            int[] scores = randomArray(30);
            int a = inRange(scores, 90, 100);
            int b = inRange(scores, 80, 90);
            int c = inRange(scores, 70, 80);
            int d = inRange(scores, 60, 70);
            int f = inRange(scores, 0, 60);

            
            /* for loop with index (i) is less efficient than
            ENHANCED FOR LOOP [SEE BELOW]*/
            // int[] counts = new int[100];
            // for (int i = 0; i < scores.length; i++) {
            //     counts[i] = inRange(scores, i, i + 1);
            // }


            // ENHANCED FOR LOOP
            int [] counts = new int[100];
            for (int score : scores) {
                counts[score]++;
            }
            
            // printing score instances
            printArray(scores);
            System.out.println();

            // DISPLAY HISTOGRAM using ASTERISKS as indicators
            for (int i = 0; i < counts.length; i++) {
                System.out.printf("%2d - %2d: ", i, i+1);
                for (int j = 0; j < counts[i]; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        


        }
    
}
