import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter three number ");
        System.out.print("Enter the first number ");
        int x= in.nextInt();
        System.out.print("Enter the second number ");
        int y= in.nextInt();
        System.out.print("Enter the third number ");
        int z= in.nextInt();
        if ((x>=y) && (y>=z) || (x<=y) && (y<=z))
            System.out.println("in order " +x +y +z);
        else
            System.out.println("not in order " +x +y +z);

    }
}
