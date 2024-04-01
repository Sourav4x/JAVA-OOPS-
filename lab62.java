import java.util.*;
class lab62{
    public static void main(String[] args)
    {
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        int vwl=0,space=0;
        for(int i=0;i<s.length();i++)
        {
            char v=s.charAt(i);
            if(v=='a'||v=='e'||v=='i'||v=='o'||v=='u'||v=='A'||v=='E'||v=='O'||v=='I'||v=='U')
            {
                       vwl++;

            }
            else if(v ==' ')
            {
               space++;
            }
        }
        int cost=s.length()-vwl-space;
        int words=s.length()-space;
System.out.println(vwl+" "+cost+" "+words);

    }
}