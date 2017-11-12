package Chrome;

import java.text.DecimalFormat;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a=2897;
		double c=(a/1000);
		System.out.println(c);
		System.out.println(String.format("%.2f", c));
		double d = c;
		DecimalFormat df = new DecimalFormat("0.##");
		System.out.println(df.format(d));
		System.out.format("%.3f%n", d);
		System.out.println(c);
		

	}

}
