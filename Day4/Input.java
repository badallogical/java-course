package Day4;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);

        System.out.println("Please Enter any Number : ");
        int a = inputObj.nextInt();     // Input Integer
        System.out.println("Input entered is " + a);

        System.out.println("Please Enter any String : ");
        String c = inputObj.next();     // Input Single String
        System.out.println("Input entered is " + c);

        inputObj.nextLine();            // Clearn the Input Buffer
        System.out.println("Please Enter any Floating value : ");
        float b = inputObj.nextFloat();    // Input the Float
        System.out.println("Input entered is " + b);
        
        inputObj.nextLine();        // empty the buffer
        System.out.println("Please Enter any Line : ");
        String d = inputObj.nextLine();          // Input the new Line     
        System.out.println("Input entered is " + d);
    }
}
