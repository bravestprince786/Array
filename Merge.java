package Array;
import java.util.*;
public class Merge {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				int arr[]=new int[6];
				int temp[]=new int[6];
				
				int arr1[]=new int[6];
				int temp1[]=new int[6];
				
				int merge[]=new int[26];
				int j=0,k=0;
				for(int i=0;i<arr.length;i++)
				{
					arr[i]=sc.nextInt();
				}
				for(int i=0;i<arr.length;i++)
				{
					if(arr[i]==arr[i+1])
					{
						temp[j++]=arr[arr.length-1];
					}
					else
					{
						temp[j++]=arr[i];
					}
				}
				
				for(int i=0;i<arr1.length;i++)
				{
					arr[i]=sc.nextInt();
				}
				for(int i=0;i<arr1.length;i++)
				{
					if(arr1[i]!=arr1[i+1])
					{
						temp1[k++]=arr1[i];
					}
					else
					{
						temp1[j++]=arr1[arr1.length-1];
					}
				}
				int c=0;
				for(int l=0;l<merge.length;l++)
				{
					merge[l]=arr[l];
					c++;
				}
				for(int l=0;l<merge.length;l++)
				{
					merge[c++]=arr[l];
					
				}
				for(int i=0;i<merge.length;i++)
				{
					System.out.println("====================");
					System.out.println(merge[i]);
				}
				

	}

}
