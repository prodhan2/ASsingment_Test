import java.util.Scanner;

public class TringlePeramiterAngleArea {
    public static void main(String[] args)
    {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter point x1,x2,y1,y2,x3,y3");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();
        double x3 = in.nextDouble();
        double y3 = in.nextDouble();
        tringle tri = new tringle(x1,x2,y1,y2,x3,y3);
        System.out.println("side length 1 = " +tri.getSideLength1());
        System.out.println("side length 2 = " +tri.getSideLength2());
        System.out.println("side length 3 = " +tri.getSideLength3());
        System.out.println("angle of A = " +tri.getAngleA());
        System.out.println("angle of B = " +tri.getAngleB());
        System.out.println("angle of C= " +tri.getAngleC());
        System.out.println("perameter= " +tri.getPerameter());
        System.out.println("area = " +tri.getArea());
    }
}
