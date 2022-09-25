import java.util.Scanner;

public class userInputArray {
    public static void main(String[] args)
    { int a[] = new int[5];
        Scanner input = new Scanner(System.in);
        for(int i =0;i< a.length;i++)
        {
            System.out.println("Enter "+(i+1)+" number=");
            a[i] = input.nextInt();
        }
        for(int i =0;i<a.length;i++) {
            System.out.println("your "+( i+1)+"number is ="+a[i]);
        }


    }

}
