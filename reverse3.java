import java.util.*;
class reverse3
{
	public static void main(String args[])
	{
		int num,rev=0;
		Scanner obj= new Scanner(System.in);
		System.out.println("enter no.");
	    num=obj.nextInt();
	     while(true)
	   {
		   if(num==0)
			   break;
		   rev=rev*10+(num%10);
		   num/=10;		 
	   }
		System.out.println("reverse="+rev);
		
	}
}