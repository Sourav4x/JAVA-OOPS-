class a{
    int x,y;
    void hi(){
System.out.println("its me hi");
    }

}
class b extends a{
void hii(){
System.out.println("hi");
    }

}
class inhe{
    public static void main(String[] args)
    {
        b b1=new b();
        b1.hi();
        b1.hii();
    }
}