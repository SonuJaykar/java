import java.util.Scanner;

// public class practical_10 {
//     public static void main(String[] args) {
//         final int x = 10;
//         System.out.println("x = " + x);
//         final String message = "Hello, world!";
//         System.out.println(message);
//         final MyClass obj = new MyClass();
//         obj.printMessage();
//     }
// }

// class MyClass {
//     public void printMessage() {
//         System.out.println("This is a final object.");
//     }
// }
class practical_2{
 
    // Main function
    public static void main(String args[])
    {
        // Variable Declaration
        Scanner in = new Scanner(System.in);
        
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int max;
 
        // Maximum among a, b, c
        max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
 
        // Print the largest number
        System.out.println("Maximum number among " + a
                           + ", " + b + " and " + c + " is "
                           + max);
    }
}