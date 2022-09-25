public class tringle {
     double x1,y1,x2,y2,x3,y3;
    public tringle (double x1,double x2,double y1,double y2,double x3,double y3)
    {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;

    }

    double a = getSideLength1();
    double b = getSideLength2();
    double c = getSideLength3();
    public double getSideLength1()
    {
      return Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));

    }
    public double getSideLength2()
    {
        return Math.sqrt(Math.pow((x1-x3),2)+Math.pow((y1-y3),2));

    }
    public double getSideLength3()
    {
        return Math.sqrt(Math.pow((x2-x3),2)+Math.pow((y2-y3),2));

    }
    public double getAngleA(){

        return Math.acos((b*b)+(c*c)-(a*a)/(2*b*c));
    }public double getAngleB(){

        return Math.acos(a*a+(c*c)-(b*b))/(2*a*c);
    }public double getAngleC(){

        return Math.acos((a*a)+(b*b)-(c*c))/(2*b*a);
    }
    public double getPerameter(){
        return getSideLength1()+getSideLength2()+getSideLength3();
    }
    double s = getPerameter()/2.0 ;
    public double getArea(){

        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }



}
