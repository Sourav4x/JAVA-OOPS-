class calc{
    
public int add(int a,int b)
{
    int r;
r=a+b;
return r;
}
}

class method{
    public static void main(String[] args)
    {
        int z;
        calc c=new calc();
        z=c.add(4,3);
         System.out.print("the result is"+z+"");
    }
    
}