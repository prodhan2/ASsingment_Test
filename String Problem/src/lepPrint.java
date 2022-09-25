import java.util.Scanner;

public class lepPrint {
    public static void main(String[] args)
    {
        System.out.println("Enter an Year=");
        Scanner input = new Scanner(System.in);
        int y = input.nextInt();
        LEAp obj = new LEAp(y);
        boolean year = obj.getYear();
        if(year)
        {
            System.out.println("This year is  Leap Year");
        }
        else
            System.out.println("This year is Not  Leap Year");

    }
}
