import java.util.Scanner;

public class MultipleNumber {
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your number=");
        int num,j,i;
        num = input.nextInt();
        for(j=1;j<=num;j++)
        {
            for(i=1;i<=10;i++)
            {
                System.out.println(j+"X"+i +"=" +j*i);
            }
            System.out.println("\n \n");
        }



    }
}
