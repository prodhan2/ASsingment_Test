public class LEAp {
    public int y;
    public LEAp(int y)
    {
        this.y = y;
    }
    public boolean getYear(){
        if(y%400==0 ||(y%4==0 && y%100!=0))
            return true;
        else
            return false;


    }
}
