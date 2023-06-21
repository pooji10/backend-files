package day13;
import java.util.Scanner;
class A extends Thread {
	Scanner sc=new Scanner(System.in);
	public void run() {
		System.out.println("assignment started");
		int i=sc.nextInt();
		System.out.println("assignment no"+i);
	}
}
class B extends Thread{
	public void run() {
		System.out.println("started");
	for(int i=0;i<=4;i++) {
		System.out.println("cbit");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	class C extends Thread{
		int a=5;
		int b=6;
		public void run() {
			System.out.println("multiplication");
			System.out.println(a*b);
		}
	}
	class multithr {
		public static void main(String[] args) {
			A z=new A();
			B y=new B();
			z.start();
			y.start();
			
			
			
		}
	}
		
	}
}

