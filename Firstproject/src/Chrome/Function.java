package Chrome;

public class Function {

	public static void main(String[] args) {
		vi(20,30);
		vi(200,300);
		vi(300,555);
		
		
		
		
	}
	public static int vi(int a,int b)
	{
		int sum=a+b;
		if(sum>100)
		{
			System.out.println("Greater than 100");
		}else
		{
			System.out.println("less than 100");
		}
		System.out.println("sum= "+sum);
		return 0;
	
	}

}
