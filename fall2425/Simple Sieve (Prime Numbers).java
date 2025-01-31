//Simple Sieve Code
import java.util.*;
public class Sieve {
    public static void Sievep(int n)
    {
        boolean[] arr=new boolean[n+1];
        for(int i=0;i<n;i++)
        {
            arr[i]=true;
        }
        for(int p=2;p*p<n;p++)
        {
            if(arr[p]==true)
            {
                for(int i=p*p;i<n;i=i+p)
                {
                    arr[i]=false;
                }
            }
        }
        for(int i=2;i<n;i++)
        {
            if(arr[i]==true)
            {
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String args[])
    {
        System.out.println("Oka number iyyi bey: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        Sievep(num);
    }
}
