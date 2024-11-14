/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainclass;

/**
 *
 * @author ASUS TUF
 */
public class oddevennum {
    public void mencari()
    {
        int even = 0;
        int odd = 0;

        // Display/tmbh even num
        System.out.println("Even numbers between 1 to 10:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) { // cek no ni even ke x
                System.out.println(i);
                even += i; // kira total even
            }
        }

        System.out.println("\nOdd integers between 1 to 10:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) { // Cek odd ke x
                System.out.println(i);
                odd += i; // kira total odd
            }
        }

        // Display sum
        System.out.println("\neven number sum: " + even);
        System.out.println("odd number sum: " + odd);
    
}
    
}
