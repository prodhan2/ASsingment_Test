import java.util.Scanner;

public class factorialDemo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num,i,fact=1;

        System.out.println("ENter your factorial number=");
        num = input.nextInt();
        for(i=num;i>=1;i--)
        {

            fact=fact*i;
        }
        System.out.println("factorial of " +num+ "=" + fact);
        System.out.println();
    }





}
