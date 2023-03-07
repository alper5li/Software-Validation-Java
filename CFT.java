import java.util.Scanner;

public class CFT {

	public static void main(String[] args) 
	{
		// START 
		
		// read input 
		Scanner scan = new Scanner(System.in);
		// n=input
		int n = scan.nextInt();
		// check n 
		if(n>=18)
		{
			System.out.println("You are Adult");
		}
		else
		{
			System.out.println("You are Underage");
		}
	}
}
