
package mainclass;

import java.util.Scanner;
public class findmaxmin {
    public void pencarian(){
        
        Scanner hadir = new Scanner(System.in);
        // Array utk letak 3 integer
        int[] numbers = new int[3];

        // loop dia
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter integer: ");
            numbers[i] = hadir.nextInt();
        }

        // nak bagi variable utk max dgn min
        int max = numbers[0];
        int min = numbers[0];

        //formula nak cari mx dgn min num
         for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        // result
        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);

        
    }
    
}
