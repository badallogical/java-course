package Day2;

public class Operator {
    public static void main(String[] args) {
        // Increment Decrement operator
        int a = 5;
        int b = a++;
        System.out.println("value of a is "+ a + " Value of b is " + b);
        
        // Increment Operator
        // Prefix Operator      ++a;
        // Postfix Operator     a++;

        b = a--;
        System.out.println("value of a is "+ a + " Value of b is " + b);

        // Bitwise operator

        // left shift << 
        int c = 4;  // 00100
        c = c * 8;  
        c = c << 3; // 10000
        System.out.println("Shift bit value " + c);

        // right shift >> 
        int d = 4;  // 00100
        // d = d / 8;  
        d = d >> 1; // 10000
        System.out.println("Shift bit value " + d);
    }
}
