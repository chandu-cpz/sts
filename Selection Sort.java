Selection Sort:
Time Complexity: O(n^2)
Space Complexity: O(1)

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            int mini=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[mini])
                {
                    mini=j;
                }
            }
            int temp=arr[mini];
            arr[mini]=arr[i];
            arr[i]=temp;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}