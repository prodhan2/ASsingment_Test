public class TaxInfo {
    int tax;
    public TaxInfo(int num) {
        this.tax =num;
    }

    public void singleTax( ){
        if (tax < 8000)
            System.out.println(" the tax is =" +(0.1*tax)+"%");
        else if (tax >= 8000 && tax < 32000)
            System.out.println("the tax is =" + (800 + .15 * tax) + "%");
        else
            System.out.println("the tax is =" + (4400 + .25 * tax) + "%");

    }
    public void married( )
    {
        if (tax < 16000)
            System.out.println(" the tax is ="+(0.1*tax)+"%");
        else if (tax >= 16000 && tax < 64000)
            System.out.println("the tax is =" + (1600 + .15 * tax) + "%");
        else
            System.out.println("the tax is =" + (8800 + .25 * tax) + "%");
    }

}
