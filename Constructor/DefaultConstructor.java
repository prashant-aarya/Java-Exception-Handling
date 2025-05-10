class DefaultConstructor
{
    int Id ;
    String Name;
    public static void main(String [] args)
    {
       DefaultConstructor obj=new DefaultConstructor();
        System.out.println("Id : "+obj.Id+"\nName : "+obj.Name);
    }
}

//Every program has constructor if user not create then compiler create automatically Default Constructor
//How to check default constructor ---> Open Cmd and Type --->  javap ClassName