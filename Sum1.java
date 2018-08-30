package Array;
import java.util.*;
public class Sum1 {
Scanner sc=new Scanner(System.in);
int x[]=new int[6];
void get()
{
	System.out.println("Enter the number :");
	for(int i=0;i<=x.length-1;i++)
	x[i]=sc.nextInt();
}
void display()
{
	System.out.println("number entered :");
	for(int i=0;i<=x.length-1;i++)
		System.out.println(x[i]);
}
void sum()
{
	int sum=0;
	for(int i=0;i<=x.length-1;i++)
		sum+=x[i];
	System.out.println("Sum of the element :");
	System.out.println(sum);
}
	
	public static void main(String[] args) {
		Sum1 obj=new Sum1();
		obj.get();
		obj.display();
		obj.sum();

	}

}
