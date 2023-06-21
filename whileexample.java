package day3;
import java.util.Scanner;
public class whileexample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s=0;
		System.out.println("enter a number:");
		int i=sc.nextInt();
	while(i>=0)
	{
		s=s+i;
		System.out.println("enter a number:");
		i=sc.nextInt();
	}
		System.out.println(s);
		
	}
}

