package test3;
import java.util.Scanner;

class CheckAgeException extends Exception
{
	public CheckAgeException()
	{
		 super("나이가 유효하지 않아여");
	}
}

public class Test {
	
	public static int checkAge() throws CheckAgeException
	{
		Scanner s =new Scanner(System.in);
		int age = s.nextInt();
		if (age < 0) throw new CheckAgeException();
		
		return age;
	}
	public static void main(String[] args) {

		Scanner s =new Scanner(System.in);
		System.out.print("나이입력");
		// int age = s.nextInt(); // 검증?
		try
		{
			 int age = checkAge();	
			 System.out.println("age : " + age);
		}
		catch(CheckAgeException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
