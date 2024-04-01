import java.util.*;
abstract class LAB{
static void me(){
System.out.println("ME");
}
abstract void he();
abstract void her();
}
abstract class LAB2 extends LAB{
    void he()
    {
        System.out.println("HE");
    }
    abstract void her();
}

class LAB3 extends LAB2 {
    void her()
    {
        System.out.println("HER");
    }
}
class absp{
    public static void main(String[] args)
    {
        LAB3 l=new LAB3();
        l.her();
        l.me();
        l.he();
    }
}
