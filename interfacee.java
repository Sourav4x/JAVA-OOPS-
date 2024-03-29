interface abc{
    float interest(int p,int y);
        
}
class hdfc implements abc{
   public float interest(int p,int y)
    {
        float rate=0.07f;
        return p*rate*y;
    }
}
class icic implements abc{
    public float interest(int p,int y){
        float r=0.08f;
        return p*y*r;
    }
}
class interfacee {
    public static void main(String[] args){
     hdfc h1=new hdfc();
     icic h2=new icic();
     double a=h1.interest(10000,10);
     double c=h2.interest(8000,10);
     System.out.println(" amt is in hdfc and icici " +a+" "+c);
    }
}