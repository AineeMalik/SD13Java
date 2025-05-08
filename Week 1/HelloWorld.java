import java.util.Scanner;
import java.util.*;

public class HelloWorld{
    //list of attributes
    //constructors
    //methods
    public static void main(String[] args)
    {
        int a, b;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        a = in.nextInt();

        System.out.println("Enter the second number: ");
        b = in.nextInt();

        int c = a + b;

        System.out.println("Sum of a and b = " + c);
    
        in.close();
    }
    
}