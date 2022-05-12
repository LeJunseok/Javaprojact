package test2;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x,y,z;
		x=(int)(Math.random()*100);
		y=(int)(Math.random()*100);
		while(y==0) {y=s.nextInt();}
		if (y==0)
			System.out.println("divide by zero error");
		else
			try {
				z = x / y;	
				System.out.printf("x:%d y:%d z:%d =",x,y,z);
			} catch(ArithmeticException e)
		{
				System.out.println("¿¬»ê error");				
		} finally {
			System.out.println("processed");
		}
			
			
			
	}

}
