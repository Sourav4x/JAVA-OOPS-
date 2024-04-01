import java.util.*;
class checkargument extends Exception{
    checkargument(String stn)
    {
        super(stn);
    }
    static void check(int ar[]) throws  checkargument
    {
        int s=0;
        if(ar.length>3)
        {
            for(int j=0;j<ar.length;j++)
            {
               s=s+ ar[j]*(ar[j]);
            }
            System.out.println(s);
        }
        else{
            throw new checkargument("Check argument");
        }
    }

}

class lab75r{
    public static void main(String[] args)
    {
        try{
            int[] a=new int[args.length];
            for(int i=0;i<args.length;i++)
            {
                a[i]=Integer.parseInt(args[i]);
            }
            checkargument.check(a);
        }
        catch(checkargument e)
        {
            System.out.println("Exception occurred :"+e.getMessage());
        }
    }
}