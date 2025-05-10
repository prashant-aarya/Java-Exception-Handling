public class MultiPara 
{
    MultiPara(int i)
    {
        System.out.println("Number : "+i);
    }
    MultiPara(int i,int j)
    {
        System.out.println("Number 1 : "+i+" || Number 2 : "+j);
    }
    MultiPara(int i,String j)
    {
         System.out.println("Number : "+i+" || Course : "+j);
    }
    MultiPara(String i,int j)
    {
         System.out.println("Name : "+i+" || Number : "+j);
    }
    MultiPara(String a, String b, int c)
    {
        System.out.println("Name : "+a+" || Post : "+b+" ||  Number : "+c);
    }
    public static void main(String[] args) 
    {
        MultiPara obj = new MultiPara(10);
        MultiPara obj2= new MultiPara(100, 200);
        MultiPara obj3= new MultiPara("Prashant Arya", 150000);
        MultiPara obj4= new MultiPara(101,"MCA");
        MultiPara obj5= new MultiPara("Prashant", "Java Devloper", 750000);

    }
    
}
