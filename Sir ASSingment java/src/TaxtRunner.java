import java.util.Scanner;

public class TaxtRunner {
    public static void main(String[] agrs)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Are your married __ YES or NOT");
        String s = in.nextLine();
        System.out.println("Enter your income==");
        int num = in.nextInt();
     TaxInfo m = new TaxInfo(num);
        if(s.equals("YES"))
        {
           m.married();
        }
        else
        {
            m.singleTax();
        }
    }
}
