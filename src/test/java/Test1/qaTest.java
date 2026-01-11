package Test1;

public class qaTest {

	public static void main(String[] args)
	{
		int orgnum=153;
		int sum=0;
		
		for(int i=orgnum;i>0;i=i/10)
		{
			int rem=i%10; // 153 % 3=3-->remainder
			sum=sum+(rem*rem*rem);
			
		}
		if(orgnum==sum)
		{
			System.out.println("Given num is armstrong num");
		}
		else
		{
			System.out.println("Given num is not armstrong num");
		}
	}
}
