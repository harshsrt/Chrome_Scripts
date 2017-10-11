package Chrome;

public class Array {

	public static void main(String[] args) {
		String str[]=new String[5];
		str[0]="harsh";
		str[1]="sachin";
		str[2]="dravid";
		str[3]="laxman";
		str[4]="sehwag";
		System.out.println("String lenght: "+str.length);
		for(int i=0; i<str.length;i++)
		{
			System.out.println("Data entered: "+str[i]);
		}
		int t[]=new int[5];
		t[0]=1;
		t[1]=2;
		t[2]=3;
		System.out.println(" lenght: "+t.length);
		for(int i=0; i<t.length;i++)
		{
			System.out.println("Data entered: "+t[i]);
		}
		
		char p[]=new char[5];
		p[0]='a';
		p[1]='f';
		p[2]='s';
		p[3]='s';
		p[4]='s';
		System.out.println(" lenght: "+p.length);
		for(int i=0; i<p.length;i++)
		{
			System.out.println("Data entered: "+p[i]);
		}
		
		

	}

}
