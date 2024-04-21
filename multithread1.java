import java.util.*;
class A extends Thread{
    public void run()
    {
        for(int i=0;i<1000;i++);
        {

        
        System.out.println("IN A CLASS");
    }
}
}
class B extends Thread{
    public void run()
    {
        for(int i=0;i<1000;i++);           // Run this Program for multiple times we'll get different output 
        {
        System.out.println("IN B Class");
        }
    }
}

class multithread1{
    public static void main(String[] args)
    {
        A obj1=new A();
        B obj2=new B();
        obj1.start();
        obj2.start();
    }
}