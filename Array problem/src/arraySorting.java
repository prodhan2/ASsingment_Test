import java.util.Arrays;

public class arraySorting {
    public static void main(String[] args)
    {  int i;
        int num[] = {1,6,7,3,6,8,3,0};
        Arrays.sort(num);
        for( i=0;i<8;i++)
        {
            System.out.println("asending order"+num[i]);
        }
    }
}
