import java.util.*;
/*class valid{
    public static void man(int a)
    {
        if(a>=18)
        {
             System.out.println("Passed");
        }
        else{
            throw new ArithmeticException("Failed");
        }
    }
}

class throwi{
    public static void main(String[] args)
    {
          valid.man(10);
          System.out.println("hello");
    }
}  */
// Java program that demonstrates the use of throw
class throwi {
	static void fun()
	{
		try {
			throw new NullPointerException("demo");
		}
		catch (NullPointerException e) {
			System.out.println("Caught inside fun()."+e.getMessage());
			     throw e;// rethrowing the exception
		}
	}

	public static void main(String args[])
	{
		try {
			fun();
		}
		catch (NullPointerException e) {
			System.out.println("Caught in main."+e.getMessage()); //if we want to print demo then  we should use e.getmessage()
		}
	}
} 
