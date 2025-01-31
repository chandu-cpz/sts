MAXIMUM SUM IN SUBARRAY

import java.util.*;
public class MaxSum
{
    public static int Maxsum(int[] arr)
    {
        int maxs=arr[0];
        int csum=arr[0];

        for(int i=1;i<arr.length;i++)
        {
            csum=Math.max(arr[i],csum+arr[i]);
            maxs=Math.max(maxs,csum);
        }
        return maxs;
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

        System.out.println(Maxsum(a));
    }
}
