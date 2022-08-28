import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        System.out.println("Input the number...");
        Scanner in=new Scanner(System.in);
        int w= in.nextInt();
        if (w > 0)
            System.out.println("th number postive.....");
        if (w < 0)
            System.out.println("the number negative....");
        else
            System.out.println("lt's zero...");


    }
}
