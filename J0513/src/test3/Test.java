package test3;
import java.util.Scanner;

class CheckAgeException extends Exception
{
	public CheckAgeException()
	{
		 super("���̰� ��ȿ���� �ʾƿ�");
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
		System.out.print("�����Է�");
		// int age = s.nextInt(); // ����?
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
