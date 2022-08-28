import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter three number ...?");
        System.out.print("Enter the first number ");
        double x=in.nextDouble();
        System.out.print("Enter the second number ");
        double y=in.nextDouble();
        System.out.print("Enter the third number ");
        double z=in.nextDouble();

        if ((x==y) && (y==z))
        {
            System.out.println("All the same");
        }
            else if ((x!=y) && (y!=z))
            {
            System.out.println("All different");
        }
            else
        {
            System.out.println("Neithe");
        }

    }
}
