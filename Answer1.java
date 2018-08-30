package Array;
import java.util.*;
class Emp
{
	String name;
	int id;
	float salary;
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of employee :");
		name=sc.next();
		System.out.println("Enter the id of emp :");
		id=sc.nextInt();
		System.out.println("Enter the salary of the emp :");
		salary=sc.nextFloat();
		
	}
	void Display()
	{
		System.out.println(name+"\t"+id+"\t"+salary);
	}
}
public class Answer1 {

	public static void main(String[] args) throws NoSuchElementException {
		Emp obj[]=new Emp[5];
		for(int i=0;i<obj.length;i++)
		{
			obj[i]=new Emp();
			obj[i].accept();
		}
		System.out.println("name\tid\tsalary");
		for(Emp obj1:obj)
		{
			obj1.Display();
		}
		//sc.close();	
	}
	
}
