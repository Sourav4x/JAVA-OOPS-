class a{
    int a,b;
    a(int p,int q)
    {
        a=p;
        b=q;

    }
}
class b extends a{
    int c;
    b(int m)
    {
        super(m,m+5);
        c=a+b;
    }
}

class inhcons{
    public static void main(String[] args)
    {
        b b1=new b(30);
        System.out.print("the value of a,b & c is "+b1.a+" "+b1.b+" "+b1.c);
    }
}