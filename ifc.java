import java.util.*;
interface abc{
    int  earnings();
    int  deductions();
    int bonus();
}

class manager implements abc{

    int earn,y;
    int d,x;
    public manager(){
    }
   public manager(int k){
       d=k;
    }
    int u=d;
@Override
public int earnings()
{
    int hra,da;
    
    da=(80*d)/100;
    hra=(15*d)/100;
   earn=d+da+hra;
   System.out.println("the earning is:- "+earn);
   return earn;

}
@Override
public int deductions(){
    int pf;
    pf=(int) (0.12* (double) d);
    System.out.println("the deducation from the salary is :  "+pf);
return pf;
}
@Override
public int bonus()
{
return 0;
}
}

class substaff extends manager{
    public substaff(int k){
        super(k);

    } 
    @Override
   public  int bonus(){
        int b=(int)0.5*u;
        System.out.println("bonus is :  "+b);
        return b;
    }

}

class ifc{
    public static void main(String[] args){
        Scanner s1=new Scanner(System.in);
        int j;
        j=s1.nextInt();
        substaff m=new substaff(j);
        
       int c= m.earnings();
        int p=m.deductions();
        int u=m.bonus();

  /* System.out.println("the earning is:- "+c);
   System.out.println("the deduction is:- "+p);
   System.out.println("bonus :- "+u); */


    }
}