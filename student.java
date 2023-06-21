package day8;
import java.util.Scanner;
class student1 {
	private String names;
	private int ages;
	private int ids;
	public student1(String n,int a,int b) {
		names=n;
		ages=a;
		ids=b;
	}
	public String getname(){
		return names;
	}
	public int getage() {
		return ages;
	}
	public int getid() {
		return ids;
	}
	public class student{
	public static void main(String[] args) {

		student1 s1=new student1("poojitha",19,1);
		student1 s2=new student1("padma",20,2);
		System.out.println(s1.getname());
		System.out.println(s1.getage());
		System.out.println(s1.getid());
		System.out.println(s2.getname());
		System.out.println(s2.getage());
		System.out.println(s2.getid());

		
		
	}
	

}
}