import java.util.Scanner;
public class Assignment2 {
		
	public static void main(String args[])
	{
	String fn,ln;
	System.out.println("Enter First Name - ");
	Scanner s=new Scanner(System.in);
	fn=s.nextLine();
	System.out.println("Enter Last Name - ");
	ln=s.nextLine();
	String fulln=fn+" "+ln;
	System.out.println("First Name: "+fn+"\nLast Name: "+ln+"\nFull Name : "+fulln);
	System.out.println("");}
	
}
