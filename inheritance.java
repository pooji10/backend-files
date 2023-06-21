package day9;
 	
/*multilevel inheritance*/class a {
		   public void display() {
		      System.out.println("pooji");
		   }
		}
		class b extends a {
		   public void display1() {
		      System.out.println("pravya");
		   }
		}
		class h extends b {
		   public void display2() {
		      System.out.println("padma");
		   }
		}
	public class inheritance extends h {
		   public static void main(String[] arguments) {
		      inheritance s= new inheritance();
		      s.display();
		      s.display1();
		      s.display2();
		   }
		}
 
		