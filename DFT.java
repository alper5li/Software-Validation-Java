import java.util.Scanner;

public class DFT {
public static void main(String[] args) 
{
	Scanner scan = new Scanner(System.in);
	int x=0;
	int a=0;
	// 1.
	x = scan.nextInt();
	// 2.
	if(x>0) {
	// 3.
		a= x+1;
	}
	// 4.
	if(x<=0) {
	// 5.
		while(x<1) {
	// 6.	
			x = x+1;
		}
	// 7.
		a = x+1;
	}
	// 8.
	System.out.println(a);
}
}
