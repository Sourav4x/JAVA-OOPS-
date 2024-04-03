import java.util.*;
class tokeniserop{
    public static void main(String[] args)
    {
        String sourav;
        Scanner s1=new Scanner(System.in);
        sourav=s1.nextLine();
        StringTokenizer st=new StringTokenizer(sourav);
        int c=st.countTokens();
        System.out.println(c);
        int total=0;
        for(int i=1;i<=c;i++)
        {
            total=total+st.nextToken().length();
        }
        System.out.println(total);
    }
}