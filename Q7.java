import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three number ");
        System.out.print("Enter the first number ");
        int x = in.nextInt();
        System.out.print("Enter the second number ");
        int y = in.nextInt();
        System.out.print("Enter the third number ");
        int z = in.nextInt();
        if ((x > y) && (y > z))
            System.out.println("increasing " + x + y + z);
        else if ((x < y) && (y < z))
            System.out.println("decreasing " + x + y + z);
        else
            System.out.println("neither " + x + y + z);
    }
}