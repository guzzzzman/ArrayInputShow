// Jose Guzman
// November 19, 2023
// File name: ArrayInputShow.java
// To Compile in terminal type: javac ArrayInputShow.java
// To Run in terminal type: ArrayInputShow 

import java.util.Scanner;

public class ArrayInputShow {
    public static void main(String[] args) {
        double[] prices = new double[9];
        Scanner keyboard = new Scanner(System.in);

        // Input values into the array
        for (int i = 0; i < prices.length; i++) {
            System.out.print("Enter price " + (i + 1) + ": ");
            prices[i] = keyboard.nextDouble();
        }

        // Output values in the order they were entered
        System.out.println("Array values in the order they were entered:");
        for (int i = 0; i < prices.length; i++) {
            System.out.println("prices[" + i + "] = " + prices[i]);
        }

        // Output values in reverse order
        System.out.println("Array values in reverse order:");
        for (int i = prices.length - 1; i >= 0; i--) {
            System.out.println("prices[" + i + "] = " + prices[i]);
        }
    }
}

/* 
Enter price 1: 10.95
Enter price 2: 16.32
Enter price 3: 12.15
Enter price 4: 8.22
Enter price 5: 15.98
Enter price 6: 26.22
Enter price 7: 13.54
Enter price 8: 6.45
Enter price 9: 17.59
Array values in the order they were entered:
prices[0] = 10.95
prices[1] = 16.32
prices[2] = 12.15
prices[3] = 8.22
prices[4] = 15.98
prices[5] = 26.22
prices[6] = 13.54
prices[7] = 6.45
prices[8] = 17.59
Array values in reverse order:
prices[8] = 17.59
prices[7] = 6.45
prices[6] = 13.54
prices[5] = 26.22
prices[4] = 15.98
prices[3] = 8.22
prices[2] = 12.15
prices[1] = 16.32
prices[0] = 10.95
/*