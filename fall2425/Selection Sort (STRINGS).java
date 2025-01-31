STRINGS SORT

import java.util.*;

public class Selection
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String[] arr=new String[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextLine();
        }
        for(int i=0;i<n-1;i++)
        {
            int mini=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j].compareTo(arr[mini])<0) {
                    mini = j;
                }
            }
            String temp=arr[mini];
            arr[mini]=arr[i];
            arr[i]=temp;
        }
        System.out.println("\n");
        System.out.println("After Sort");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
