import java.util.*;
class invalidtime extends Exception{
   public invalidtime(String s)
    {
        super(s);
    }
static void inp(int hr,int min,int sec) throws invalidtime
{
if(hr<0 || hr>24)
{
   throw new invalidtime("hour can't be greater than 24 or lesser than 0");
}
else if(min<0 || min>60)
{
    throw new invalidtime("minutes can't be greater than 60");
}
else if(sec<0 || sec>60)
{
    throw new invalidtime("Second can't be greater than 60");
}
else{
    System.out.println(hr+":"+min+":"+sec);
}
}
}

class lab74{
    public static void main(String[] args)
    {
        try{
        Scanner s1=new Scanner(System.in);
        int  x=s1.nextInt();
        int y=s1.nextInt();
        int z=s1.nextInt();
        invalidtime.inp(x,y,z);
        }
        catch(invalidtime e)
        {
            System.out.println("Exception occurred: "+e.getMessage());
        }
    }
}