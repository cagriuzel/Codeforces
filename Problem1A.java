import java.util.Scanner;


//Theatre Square
public class Problem1A {
		
	public static void main(String args[])
	{
		
		try (Scanner sr = new Scanner(System.in)) {
			double n = sr.nextInt();
			double m = sr.nextInt();
			double a = sr.nextInt();
			
			System.out.println((long)(Math.ceil(n/a) * Math.ceil(m/a)));		
		} 
	}
}