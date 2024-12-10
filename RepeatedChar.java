import java.util.Arrays;
import java.util.Scanner;

public class RepeatedChar {
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
       int max=0;
       int index=0;
       for(int i=0;i<26;i++)
       {
        if(c[i]>max)
        {
            max=c[i];
            index=i;
        }
       }
       System.out.println("The most Repeated Character="+(char)(index+65));
}
}
