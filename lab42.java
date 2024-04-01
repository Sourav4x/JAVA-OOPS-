import java.util.*;
class plate{
    int l,w;
    plate(int l,int w)
    {
        this.l=l;
        this.w=w;
    }
    void show()
    {
         System.out.println("AT plate :- "+l+" and "+w);
    }
    
}
class box extends plate{
int h;
box(int l,int w,int h)
{
  super(l,w);
  this.h=h;
}
void show()
{
  System.out.println("AT BOX :- "+l+" and "+w+" "+h);
}
}
class woodbox extends box{
    int thick;
    woodbox(int l,int w,int h,int thick)
    {
        super(l,w,h);
        this.thick=thick;
    }
    void show()
    {
    System.out.println("AT woodbox :- "+l+" and "+w+" "+h+" "+thick);
}
}

class lab42{
    public static void main(String[] args)
    {
        
        plate p=new plate(88,9);
        p.show();
        
        box b=new box(6,7,8);
        b.show();
        woodbox w=new woodbox(3,4,5,6);
        w.show();

    }
}