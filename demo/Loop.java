package Demo_package;

//import Examples.String;

public class Loop 
{
	public static void main(String[] args) 
	{
		//Scanner s=new Scanner(System.in);
		System.out.println("enter the value of n :");
		//int n=10;//s.nextInt();
		//s.close();
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5-i;j++)
			{
				System.out.print("* ");
				
			}
			System.out.println();
		}
	}
	
}
