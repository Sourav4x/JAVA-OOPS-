import java.util.*;
class APPLE{
    void show()
    {
        System.out.println("APPLE");
    }
}
class BANANA extends APPLE{
    void show()
    {
        System.out.println("BANANA");
    }
}
class CHERRY extends APPLE{
    void show()
    {
        System.out.println("CHERRY");
    }
}

class lab43{
    public static void main(String[] args)
    {
        APPLE a;
        APPLE b;
        APPLE c=new APPLE();
        BANANA b1=new BANANA();
        CHERRY c1=new CHERRY();
        a=b1;
        b=c1;
        a.show();
        b.show();
        c.show();

    }
}