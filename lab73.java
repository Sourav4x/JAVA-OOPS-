import java.util.*;

class processinput extends Exception{
    public processinput(String s)
    {
         super(s);
    }
    public static void validate(int y) throws processinput
    {
        if(y<0)
         {
            throw new processinput("Number should be positive");
         }
         else{
                System.out.println(y*2);
         }
    }
}

class lab73{
    public static void main(String[] args)
    {
        try{
        Scanner s1=new Scanner(System.in);
        int x=s1.nextInt();
        processinput.validate(x);

        }
        catch(processinput e)
        {
            System.out.println("Exception occurred : negative number exception : "+e.getMessage());
        }

    }
}