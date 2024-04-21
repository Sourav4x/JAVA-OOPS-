import java.util.*;
class A implements Runnable{
    public void run()
    {
        for(int i=0;i<1000;i++);
        {

        
        System.out.println("IN A CLASS");
    }
}
}
class B implements Runnable{
    public void run()
    {
        for(int i=0;i<1000;i++);           // Run this prog multiple times without try catch block below to have diff output
        {
        System.out.println("IN B Class");
        }
    }
}

class runnablethread{
    public static void main(String[] args)
    {
        Runnable obj1=new A();
        Runnable obj2=new B();

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);

       System.out.println(t1.getPriority());  // provides priority as the method suggests 
        t1.setPriority(Thread.MAX_PRIORITY-1);
         System.out.println(t1.getPriority());
     
        t1.start();
        try{
            Thread.sleep(20);
        }catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        t2.start();
    }
}
