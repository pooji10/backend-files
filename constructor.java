package day8;

 class student {
	private String names;
	private int ages;
	private int ids;
	public student(String n,int a,int b) {
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
	}
	public class constructor{
	public static void main(String[] args) {

		student s1=new student("poojitha",19,1);
		student s2=new student("padma",20,2);
		System.out.println(s1.getname());
		System.out.println(s1.getage());
		System.out.println(s1.getid());
		System.out.println(s2.getname());
		System.out.println(s2.getage());
		System.out.println(s2.getid());

		
		
	}
	

}
