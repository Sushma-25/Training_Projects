import java.util.*;
public class Assignment1 {
	static int a;
	public static void main(String args[])
	{
		System.out.println( a);
		String k;
 int a=0,b=0;
 Scanner s=new Scanner(System.in);
 while(true)
	{
	try {
	System.out.println("Enter a and b value");
	a=s.nextInt();
	b=s.nextInt();
		}
		catch(InputMismatchException e)
		{ System.out.println("Wrong input");
		break;
		}	
	
	System.out.println("Total:"+(a+b));
	System.out.println("Enter exit to terminate and cnt to continue");
	k=s.next();
	if(k.equals("exit"))
		break;
	if(k.equals("cnt"))
		continue;
	}
	
	}
	}
