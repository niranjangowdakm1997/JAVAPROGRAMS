package JavaPractice;

public class FirstMaxNumberWithoutusingBubbleSort {
	
	public static void main(String[] args) {
		
		int[] a= {30,10,20,50,60};
		int max=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println(max);
		
	}

}
