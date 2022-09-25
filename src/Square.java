public class Square
  {
    private int sideLength;
    public Square(int initialLength)
    {
        sideLength = initialLength;

    }
    public int getArea() { int area;
        area=sideLength*sideLength;
    return area ;}
    public void grow()
    { sideLength = 2 * sideLength; }
    public static void main(String [] args){
        Square square = new Square (2);
        System.out.println(square.getArea());
        square.grow();
        System.out.println(square.getArea());
    }
}