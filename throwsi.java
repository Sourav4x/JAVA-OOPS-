import java.util.*;
class calc{
    static void fun(int a[])throws  ArrayIndexOutOfBoundsException{
            a[3]=30;                                          // if it gets exceeded then it will throw errror in catch block 
    }
}                                                        

class throwsi{
    public static void main(String[] args)
    {
        int[] b=new int[3];
        try{

            calc.fun(b);

        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index exceeded");
        }
    }
}