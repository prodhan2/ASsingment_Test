import java.util.Scanner;
public class ArrayInput {
    public static void main(String [] args)
    {   int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number=");
        n = input.nextInt();
        int[] array = new int[10];
        for(int i=0;i<n;i++)
        {
            array[i]= input.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(array[i]+" "  );
        }


    }



}
