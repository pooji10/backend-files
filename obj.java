package day8;
import java.util.Scanner;
public class obj{
	Scanner sc=new Scanner(System.in);
		/*int id=sc.nextInt();
		String name=sc.next();
		public void study()
		{
			System.out.println("Student is studying");
			System.out.println(id);
			System.out.println(name);
		}
			public static void main(String[] args) {
				obj o=new obj();
				obj o1=new obj();
				o.study();
				o1.study();
			}*/
	/*fan example*/
	String company=sc.next();
	int wings=sc.nextInt();
	String color=sc.next();
	public void study()
	{
		System.out.print(company);
		System.out.print(" fan is rotating");
		
		
	}
	public static void main(String[] args) {
		obj o=new obj();
		o.study();
	}
}


