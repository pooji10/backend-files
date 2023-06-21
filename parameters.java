package day9;
import java.util.Scanner;
public class parameters {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	parameters s=new parameters();
	System.out.println(s.add(10,20));
	System.out.println(s.add((float)50,(float)20));
	}
	int add(int a,int b) {
		return a+b;
	}
	float add(float a,float b) {
		return a-b;
		
	}
}
