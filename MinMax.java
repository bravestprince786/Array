package Array;
import java.util.*;
public class MinMax {

	
	public void getArray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Range for an array :");
		int range=sc.nextInt();
		int arr[]=new int[range];
		for(int i=0;i<range;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Entered element :");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		int m;
		m=arr[0];
		for(int i=0;i<=arr.length-1;i++)
		{
			if(m<arr[i])
			{
				System.out.println("maximum number is :"+arr[i]);
			}
			
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			if(m>arr[i])
			{
				System.out.println("minimum number is :"+arr[i]);
			}
		}
		
		
	}
	
	
	public static void main(String[] args) {
		MinMax n =new MinMax();
		n.getArray();

	}

}
