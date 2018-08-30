package Array;
import java.util.*;
public class Ascending {
	//System.out.println();
public void ascend()
{
	int n;
	int temp;
	int temp1;
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter array Size");
	n=sc.nextInt();
	int arr[]=new int[n];
	System.out.println("Enter array Elements");
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	
	for(int i=0;i<n-1;i++)
	{
		for( int j=0;j<n-i-1;j++)
			{
			if(arr[j]>arr[j+1]) {
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
			}
	}
	System.out.println("=================ascending==============");
	for(int i=0;i<n;i++)
	{
		System.out.println(arr[i]);
	}
	System.out.println("=================descending==============");

for(int i=arr.length-1;i>=0;i--)
	{
		//System.out.println(arr[i]);
		
		temp1=arr[i];
		System.out.println(temp1);
	}
}
	
	public static void main(String[] args) {
		
		Ascending a=new Ascending();
		a.ascend();
		
	}

}
