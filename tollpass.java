package day3;
import java.util.Scanner;
public class tollpass {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a,b,c;
	int d=sc.nextInt();
	int e=sc.nextInt();
	int o=sc.nextInt();
	int t=sc.nextInt();
	int m=sc.nextInt();
	if(o<t && t<m) {
		a=d*o;
		b=e*t;
		c=a+b;
		if(c<m) 
			System.out.println("one way pass + two way pass");
		else 
			System.out.println("Monthly pass");
	}
		else
			System.out.println("Invalid Input");
	}
}


	
	
	
	

