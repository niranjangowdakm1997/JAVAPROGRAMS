package JavaPractice;

public class Pen {
	
	String clr;
	int price;
	String brand;
	
	
	public Pen(String clr, int price, String brand) {
		this.clr = clr;
		this.price = price;
		this.brand = brand;
	}
	


	@Override
	public String toString() {
		return "Pen [clr=" + clr + ", price=" + price + ", brand=" + brand + "]";
	}



	public static void main(String[] args) {
		 Pen p= new Pen("black",10,"Parkar");
		 System.out.println(p);
//		 System.out.println(p.clr);
//		 System.out.println(p.price);
//		 System.out.println(p.brand);
//		 
	}

}
