import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num_of_day=0;
        String month_name="unknown";
        System.out.print("input a month number ");
        int month= input.nextInt();
        System.out.print("input a year ");
        int year= input.nextInt();

        switch (month)
        {
            case 1:
                month_name="January";
                num_of_day=31;
                break;
            case 2:
                month_name="February";
                num_of_day=29;
                break;
            case 3:
                month_name="March";
                num_of_day=31;
                break;
            case 4:
                month_name="April";
                num_of_day=30;
                break;
            case 5:
                 month_name="May";
                 num_of_day=31;
                 break;
            case 6:
                 month_name="June";
                 num_of_day=31;
                 break;
            case 7:
                month_name="Jule";
                num_of_day=31;
                break;
            case 8:
                month_name="August";
                num_of_day=31;
                break;
            case 9:
                month_name="September";
                num_of_day=30;
                 break ;
            case 10:
                month_name="October";
                num_of_day=30;
                break;
            case 11:
                month_name="November";
                num_of_day=30;
                break;
            case 12:
                month_name="December";
                num_of_day=31;
                break;
        }
        System.out.println(month_name+ " " +year +" has "+ num_of_day+ " days\n");
    }
}
