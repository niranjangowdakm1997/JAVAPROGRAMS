package JavaPractice;

public class MLoading {
	
	public void add(int a)
	{
		System.out.println("am a int parameter");
	}
	
	public void add(float b)
	{
		System.out.println("am a String parameter");
	}
	
	public static void main(String[] args) {
		MLoading ml=new MLoading();
		ml.add(10);
		ml.add(10.5f);
		ml.add('a');
	}
}
