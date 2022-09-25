import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args)
    {
        int a[] = {10,44,5,22,6,35,97,32};
        System.out.println("the orginal array is =");
        for(int num : a)
        {
            System.out.println(num+" ");
        }
        Arrays.sort(a,2,5);
        System.out.println("Your sorted array is =");
        for(int num : a) {
            System.out.println(num+" ");
        }

    }
}

