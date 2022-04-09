package JavaPractice;

public class GrandChild extends Child {
	
	public static void drnk()
	{
		System.out.println("water and milk and soda");
	}
	
	public static void main(String[] args) {
		
//		GrandChild gc=new GrandChild();
//		gc.drnk();
		
		Parent p=new GrandChild();
		p.drnk();
		
	}

}
