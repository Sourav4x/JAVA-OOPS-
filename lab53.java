import java.util.*;
interface given{
    double earnings();
    double deductions();
    double bonus();
}

abstract class manager implements given{
    double basic;
    public manager(double basic)
    {
        this.basic=basic;
    }
    public double earnings()
    {
       double da=0.8*basic;
       double hra=0.15*basic;
       return basic+da+hra;
    }
    public double deductions()
    {
        double pf=0.12 * basic;
        return pf;
    }
    public abstract double bonus();
    

}
class substaff extends manager{
    substaff(double basic)
    {
        super(basic);
    }
    public double bonus()
    {
        double bonus = 0.5*basic;
        return bonus;
    }
}

class lab53{
    public static void main(String[] args)
    {
        System.out.println("ENTER YOUR BASIC SALARY:-- ");
        Scanner s1=new Scanner(System.in);
        double m=s1.nextDouble();
        substaff s=new substaff(m);
        double x=s.earnings();
        double y=s.deductions();
        double z=s.bonus();
        System.out.println("your total earning is :-- "+x+" and deduction is :--  "+y+" and rest of the bonus is :--  "+z);

    }
} 
