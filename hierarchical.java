package day9;
	class a {
		   public void methoda() {
		      System.out.println("pooji");
		   }
		}
		class b extends a {
		   public void methodb() {
		      System.out.println("pravya");
		   }
		}
		class c extends a {
			   public void methodc() {
			      System.out.println("padma");
			   }
			}
		public class hierarchical extends c {
			   public static void main(String[] args) {
			      hierarchical s= new hierarchical();
			      a obj0=new a();
			      b obj1 = new b();
			      c obj2 = new c();
			      obj0.methoda();
			      obj1.methodb();
			      obj2.methodc();
			      
			
			   }
			}
	 
