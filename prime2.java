import java.util.*;
class prime2
{
	public static void main(String args[])
	{
		int num,i,factor=0;
		Scanner obj= new Scanner(System.in);
		System.out.println("enter no.");
	    num=obj.nextInt();
	   for(i=1;i<=num;i++)
	   {
		   if(num%i==0)
		   {
			   factor++;
		   }
	   }
	   if(factor==2)
		System.out.println("prime number");
	else
				System.out.println("not prime number");

	}
}