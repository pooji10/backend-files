package day3;
import java.util.Scanner;
public class Switch {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a value:");
	int i=sc.nextInt();
	switch(i) {
	case 1:System.out.println("add");
	System.out.println("enter a value:");
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println(a+b);
	break;
	case 2:System.out.println("sub");
	System.out.println("enter a value:");
	int c=sc.nextInt();
	int d=sc.nextInt();
	System.out.println(c-d);
	break;
	default:System.out.println("not valid");
	}
	}
	}

