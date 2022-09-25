import java.time.Year;
import java.util.Scanner;

public class Tax {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Are you married or not type -YES OR NOT=");
        String s = input.nextLine();
        if(s.equals("YES")) {
            System.out.println("Enter your amount=");
            int tax= input.nextInt();
            if (tax < 8000)
                System.out.println(" the tax is =" +(01.*tax)+"%");
            else if (tax >= 8000 && tax < 32000)
                System.out.println("the tax is =" + (800 + .15 * tax) + "%");
            else
                System.out.println("the tax is =" + (4400 + .25 * tax) + "%");
        }
    else {
            System.out.println("Enter your amount=");
            int tax= input.nextInt();
            if (tax < 16000)
                System.out.println(" the tax is ="+(0.1*tax)+"%");
            else if (tax >= 16000 && tax < 64000)
                System.out.println("the tax is =" + (1600 + .15 * tax) + "%");
            else
                System.out.println("the tax is =" + (8800 + .25 * tax) + "%");
        }

    }
}
