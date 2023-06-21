package day10;
	abstract class car1 {
	public  abstract void drive();
	public void drive(int a) {
		System.out.println("music");
	}
	public void music() {
		System.out.println("music2");
	}
	}
	abstract class audi1 extends car1{
		public abstract void fly();
			public void drive() {
			System.out.println("drive");
		}
	}

	class updatedaud1 extends audi{
		public void fly() {
			System.out.println("fly");
		}
	}

	public class overriding
	{
		public static void main(String[] args) {
			updatedaud1 s=new updatedaud1();
			s.music();
			s.drive();
			s.fly();
			s.drive(2);
			
			
			
			
			
	}

	}


