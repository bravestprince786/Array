
 package Array;
 import java.util.*;
public class Duplicate
{
    static int removeDuplicates(int arr[], int n)
    {
        if (n==0 || n==1)
            return n;
      
        int[] temp = new int[n];
         
     
        int j = 0;
        for (int i=0; i<n-1; i++)
            if (arr[i] != arr[i+1]) 
                temp[j++] = arr[i];
    
        temp[j++] = arr[n-1];   
         
     
        for (int i=0; i<j; i++)
            arr[i] = temp[i];
      
        return j;
    }
     
    public static void main (String[] args) 
    {
    	Scanner sc=new Scanner(System.in);
    	int arr[]=new int[5];
    	System.out.println("enter the element");
    	for(int i=0;i<arr.length;i++)
        arr[i] =sc.nextInt() ;
        int n = arr.length;
         
        n = removeDuplicates(arr, n);
  
     System.out.println("===============duplicate removed ================");
        for (int i=0; i<n; i++)
           System.out.print(arr[i]+" ");
    }
}