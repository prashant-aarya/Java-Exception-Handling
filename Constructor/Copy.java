class CopyCon 
{
    int a;
    String b;
    CopyCon()
    {
        a=10;
        b="Java Devloper";
        System.out.println("a = "+a+" b = "+b);
    }
    CopyCon(CopyCon ref)
    {
        a=ref.a;
        b=ref.b;
        System.out.println("a = "+a+" b = "+b);
    }
    
}
class Copy
{
    public static void main(String[] args) 
    {
        CopyCon obj = new CopyCon();
        CopyCon obj2= new CopyCon(obj);    
    }
    
}