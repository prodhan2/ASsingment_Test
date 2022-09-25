public class spiltString {
    public static void main(String[] args)
    {  String  s ="sujan@prodhan@cse";
        String r = new String("sdaf");
        String k[] =s.split("@");
        System.out.println(r);
        for(int i=0;i<s.length();i++)
        {
            System.out.println(k[i]);
        }
    }
}
