package Test;
import java.util.Scanner;

public class test {
//�ʵ�

private int[] kor_stu;
private int[] eng_stu;
private int[] mat_stu;

int score = 0;
private int n;

public test()

{

Scanner s = new Scanner(System.in);

kor_stu = null;
eng_stu = null;
mat_stu = null;

System.out.print("�л� �� �Է� : ");

n = s.nextInt();
// �л� 3���� �迭 �� 
kor_stu = new int[n];
eng_stu = new int[n];
mat_stu = new int[n];

for(int i = 0; i<n; i++)

{
	kor_stu[i] = eng_stu[i] = mat_stu[i] = 0;
}

}

// ä��
public void jumsu()

{

	//����,����,���� ������ ����

	int[] kor_dapji = {1,2,3,4,1,2,3,4,1,2};
	int[] eng_dapji = {1,2,3,4,1,2,3,4,1,2};
	int[] mat_dapji = {1,2,3,4,1,2,3,4,1,2};


	System.out.println("-------------------------");
	System.out.println("���� ");
	System.out.printf("����1 ");
// for���� ����Ͽ� 10��° ���� �� ������
	for(int i=0; i<kor_dapji.length; i++)
		System.out.printf("%2d",kor_dapji[i]);
	System.out.printf("\n����2 ");

	for(int i=0; i<eng_dapji.length; i++)
		System.out.printf("%2d",eng_dapji[i]);
		System.out.printf("\n����3 ");
	
	for(int i=0; i<mat_dapji.length; i++)
		System.out.printf("%2d",mat_dapji[i]);

		System.out.println("\n-------------------------");

		// for ���� �̿��Ͽ� n�� �°� �ʱ�ȭ �ϴ� ����
	for(int i=0; i<n; i++)
	{

		kor_stu[i] = 0; 
		eng_stu[i] = 0; 
		mat_stu[i] = 0; 

	}

	for (int j=0; j<n; j++) //�л� �� n��
	{

		//�л� 3���� �����

		int[] stu_dapji = new int[10];
		int[] stu_dapjie = new int[10];
		int[] stu_dapjim = new int[10];


		//���� 3���� �л� �����

		System.out.printf("�л�%d\n",j+1);
		System.out.print("����1 ");

		for(int i=0; i<10; i++)

		{

			stu_dapji[i] = (int)(Math.random()*4+1);
			System.out.printf("%2d",stu_dapji[i]);
		}

		System.out.println("");
		System.out.print("����2 ");
		for(int i=0; i<10; i++)

		{
			stu_dapjie[i] = (int)(Math.random()*4+1);
			System.out.printf("%2d",stu_dapjie[i]);


		}

		System.out.println("");
		System.out.print("����3 ");

		for(int i=0; i<10; i++)
		{

			stu_dapjim[i] = (int)(Math.random()*4+1);
			System.out.printf("%2d",stu_dapjim[i]);

		}



		System.out.println("\n-------------------------------");


		//ä��
		//���� ����
		int o = 0;
		int e = 0;
		int m = 0;

		System.out.printf("����1 ");

		
		// ox �����
		for (int i=0; i<10; i++)

		{
			if (kor_dapji[i] == stu_dapji[i])
			{
				o++;
				System.out.print(" O");
			}
			else
				System.out.print(" X");
			}
		
		//������ǥ

		System.out.printf(" %d��\n", o*10);
		//����
		kor_stu[j] = o*10;
		System.out.printf("����2 ");

		for (int i=0; i<10; i++)
		{
			
			if (eng_dapji[i] == stu_dapjie[i])

		{
				e++;

				System.out.print(" O");
		}
			else
				System.out.print(" X");
		}

		System.out.printf(" %d��\n", e*10);
		//����
		eng_stu[j] = e*10;


		System.out.printf("����3 ");
		//����
		for (int i=0; i<10; i++)
		{
			if (mat_dapji[i] == stu_dapjim[i])
			{
				m++;
				System.out.print(" O");
			}
			else
				System.out.print(" X");
		}

		System.out.printf(" %d��\n", m*10);

		mat_stu[j] = m*10;



		//���� ��ǥ ������ ���� 100������ ���� ���� ���ϱ� 10

		kor_stu[j] = o*10;
		eng_stu[j] = e*10;
		mat_stu[j] = m*10;
		// �հ� ��� ��
		int hap = kor_stu[j] +eng_stu[j]+mat_stu[j];
		int avg = hap/3;


		System.out.println("\n-------------------------------");
		System.out.println("����  ����1  ����2  ����3  ����  ��� ");
		System.out.println("-------------------------------");

		System.out.printf("�л�%d",j+1);
		System.out.printf(" %d�� ", kor_stu[j]);
		System.out.printf(" %d�� ", eng_stu[j]);
		System.out.printf(" %d�� ", mat_stu[j]);
		System.out.printf(" %d�� ", hap);
		System.out.printf(" %d��\n ", avg);
		
		
		System.out.println("\n===============================");
		System.out.println("\n-------------------------------");
		System.out.println(" ����  ����1    ����2     ����3");
		System.out.println("-------------------------------");
		for(int i=0;i<n;i++) {
			System.out.printf(" �л�%d %3d��   %3d��   %3d��\n", i+1, kor_stu[i], eng_stu[i], mat_stu[i]);
		}	
		
		System.out.print("-------------------------------\n");


}

}
// ���� ó��
public void sungj()
{
	for (int j=0; j<n; j++) //�л� �� n��
	{
	char point = ' ';
	// ���� ���� �ο��Ͽ� 1~100 ���� �������� ��
	int kor = (int)(Math.random()*99+1);
	int eng = (int)(Math.random()*99+1);
	int mat = (int)(Math.random()*99+1);
	int kor1 = (int)(Math.random()*99+1);
	int eng1 = (int)(Math.random()*99+1);
	int mat1 = (int)(Math.random()*99+1);
	// ���� ���� �ο��Ͽ� 1~10���� �������� ��
	int chl = (int)(Math.random()*9+1);
	int lefo = (int)(Math.random()*9+1);
	// �߰�,�⸻ ������ ,��, ��հ� ���ϱ�
	int tot = (kor+eng+mat)/3;
	int tot1 = (kor1+eng1+mat1)/3;
	int hap = kor+eng+mat+kor1+eng1+mat1+lefo+chl;
	int avg = tot+tot1+((lefo+chl)/3);
	//�й�


    
    if (avg >= 130)
    {
    	point = 'A';
    }
    else if (avg >= 120)
    {
    	point = 'B';
    }
    else if (avg >= 100)
    {
    	point = 'C';
    }
    else if (avg >= 80)
    {
    	point = 'D';
    }
	System.out.print("-------------------------------\n");
	System.out.printf(" �й� �߰� �⸻��� ����Ʈ �⼮ ���� ����\n");
	System.out.println("  "+j+1+"  "+tot+"   "+tot1+"    "+lefo+"    "+chl+"  "+hap+"  "+point);
	System.out.print("-------------------------------\n");
}
}

public static void main(String[] arge)

{

Scanner s = new Scanner(System.in);

int n=0; //�л� �� �Է�


test t = new test();

while(true)

{

System.out.println("������������������������������������������");
System.out.println("�� 1 :    ä��        �� ");
System.out.println("�� 2 :    ����ó��     �� ");
System.out.println("�� 2 :    ������ ���ϱ� �� ");
System.out.println("�� 4 :    ����        �� ");
System.out.println("������������������������������������������");

System.out.print("�޴� ���� : ");

String sel = s.next();


if (sel.equals("1"))

{

	t.jumsu();

}


else if (sel.equals("2"))

{

  t.sungj();



}


else if (sel.equals("3"))

{

  t.sungj();



}


else if (sel.equals("4"))

{

System.out.println("bye");

break;

}

else continue;

}

s.close();

}//main

}//class