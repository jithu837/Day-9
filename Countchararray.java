import java.util.*;
public class Countchararray {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        //For Uppercase
        String a=sc.next();
        int c[]=new int[26];
        for(int i=0;i<a.length();i++)
        {
           c[((int)(a.charAt(i)))-65]++;
        }
        System.out.println(Arrays.toString(c));
        //For Lowercase
        String b=sc.next();
        int c1[]=new int[26];
        for(int i=0;i<b.length();i++)
        {
           c1[((int)(b.charAt(i)))-97]++;
        }
        System.out.println(Arrays.toString(c1));
    }
}
