import java.util.*;
abstract class student{
    int roll,reg;
    student(int roll,int reg)
    {
        this.roll=roll;
        this.reg=reg;
    }
 void getinput(int i,int j)
 {
      roll=i;
      reg=j;
 }
 abstract void course();
}

class kiitian extends student{

    kiitian(int m,int n)
    {
        super(m,n);
    }
    void course(){
        if(roll>0)
        {
           System.out.println("ROLL:-- "+roll+"  REG:-- "+reg+"  CSE");
        }
    }
}

class lab51{
     public static void main(String[] args)
     {
        kiitian k=new kiitian(1,2261);
        k.course();

     }
}