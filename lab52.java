import java.util.*;
interface Motor{
    int capacity=100;
    void run();
    void consume();
}
class Washingmachine implements Motor{
    public void run(){

    }
    public void consume()
    {

    }
           
}
class lab52{
    public static void main(String[] args)
    {
        Washingmachine w=new Washingmachine();
        int k=w.capacity;
        System.out.println(k);

    }
}