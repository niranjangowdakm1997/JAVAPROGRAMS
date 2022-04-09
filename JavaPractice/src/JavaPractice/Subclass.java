package JavaPractice;

public class Subclass extends Superclass {
	
	public void add(String g)
	{
		System.out.println("am string parameterized method of sub");
	}
	
	public static void main(String[] args) {
		Superclass sc=new Subclass();
		sc.add("sdet");
		sc.add(new StringBuffer());
//		sc.add(null);
	}

}
