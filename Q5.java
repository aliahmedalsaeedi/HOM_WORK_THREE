import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Plaease Enter number ");
        long N=input.nextLong();
        int result=1;
        if (N < 0)N*=-1;
            if((N >= 10) && (N < 100))
            {
                result = 2;
            }
            else if ((N >= 100) && (N <1000))
            {
                result =3;
            }
            else if ((N >=1000) && (N < 10000))
            {
                result = 4;
            }
            else if ((N >=10000) && (N < 100000))
            {
                result = 5;
            }
            else if ((N >=100000) && (N < 1000000))
            {
                result = 6;
            }
            else if ((N >=1000000) && (N < 10000000))
            {
                result = 7;
            }
            else if ((N >=10000000) && (N < 100000000))
            {
                result = 8;
            }
            else if ((N >=100000000) && (N < 1000000000 ))
            {
                result = 9;
            }
            else if ((N >=1000000000) && (N < 1000000000))
            {
                result = 10;
            }
            else
            {
                System.out.println("Number is greater then 10 billion");
            }
        System.out.println("Result : " +result);

    }
}
