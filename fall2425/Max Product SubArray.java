MAXIMUM PRODUCT IN SUBARRAY

import java.util.*;
public class MaxProduct
{
    public static int Maxproduct(int[] arr)
    {
        int maxp=arr[0];
        int minp=arr[0];
        int result=arr[0];

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<0)
            {
                int temp=maxp;
                maxp=minp;
                minp=temp;
            }
            maxp=Math.max(arr[i],maxp*arr[i]);
            minp=Math.min(arr[i],minp*arr[i]);

            result=Math.max(result,maxp);

        }
        return result;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println(Maxproduct(a));
    }
}
