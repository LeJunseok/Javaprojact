package Test;
import java.util.Scanner;

public class test {
//필드

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

System.out.print("학생 수 입력 : ");

n = s.nextInt();
// 학생 3과목 배열 값 
kor_stu = new int[n];
eng_stu = new int[n];
mat_stu = new int[n];

for(int i = 0; i<n; i++)

{
	kor_stu[i] = eng_stu[i] = mat_stu[i] = 0;
}

}

// 채점
public void jumsu()

{

	//국어,수학,영어 정답지 생성

	int[] kor_dapji = {1,2,3,4,1,2,3,4,1,2};
	int[] eng_dapji = {1,2,3,4,1,2,3,4,1,2};
	int[] mat_dapji = {1,2,3,4,1,2,3,4,1,2};


	System.out.println("-------------------------");
	System.out.println("정답 ");
	System.out.printf("과목1 ");
// for문을 사용하여 10번째 까지 값 나오기
	for(int i=0; i<kor_dapji.length; i++)
		System.out.printf("%2d",kor_dapji[i]);
	System.out.printf("\n과목2 ");

	for(int i=0; i<eng_dapji.length; i++)
		System.out.printf("%2d",eng_dapji[i]);
		System.out.printf("\n과목3 ");
	
	for(int i=0; i<mat_dapji.length; i++)
		System.out.printf("%2d",mat_dapji[i]);

		System.out.println("\n-------------------------");

		// for 문을 이용하여 n가 맞게 초기화 하는 문장
	for(int i=0; i<n; i++)
	{

		kor_stu[i] = 0; 
		eng_stu[i] = 0; 
		mat_stu[i] = 0; 

	}

	for (int j=0; j<n; j++) //학생 수 n명
	{

		//학생 3과목 답안지

		int[] stu_dapji = new int[10];
		int[] stu_dapjie = new int[10];
		int[] stu_dapjim = new int[10];


		//시험 3과목 학생 답안지

		System.out.printf("학생%d\n",j+1);
		System.out.print("과목1 ");

		for(int i=0; i<10; i++)

		{

			stu_dapji[i] = (int)(Math.random()*4+1);
			System.out.printf("%2d",stu_dapji[i]);
		}

		System.out.println("");
		System.out.print("과목2 ");
		for(int i=0; i<10; i++)

		{
			stu_dapjie[i] = (int)(Math.random()*4+1);
			System.out.printf("%2d",stu_dapjie[i]);


		}

		System.out.println("");
		System.out.print("과목3 ");

		for(int i=0; i<10; i++)
		{

			stu_dapjim[i] = (int)(Math.random()*4+1);
			System.out.printf("%2d",stu_dapjim[i]);

		}



		System.out.println("\n-------------------------------");


		//채점
		//맞은 개수
		int o = 0;
		int e = 0;
		int m = 0;

		System.out.printf("과목1 ");

		
		// ox 답안지
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
		
		//점수발표

		System.out.printf(" %d점\n", o*10);
		//국어
		kor_stu[j] = o*10;
		System.out.printf("과목2 ");

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

		System.out.printf(" %d점\n", e*10);
		//영어
		eng_stu[j] = e*10;


		System.out.printf("과목3 ");
		//수학
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

		System.out.printf(" %d점\n", m*10);

		mat_stu[j] = m*10;



		//점수 발표 각각의 점수 100점값을 내기 위해 곱하기 10

		kor_stu[j] = o*10;
		eng_stu[j] = e*10;
		mat_stu[j] = m*10;
		// 합과 평균 값
		int hap = kor_stu[j] +eng_stu[j]+mat_stu[j];
		int avg = hap/3;


		System.out.println("\n-------------------------------");
		System.out.println("성명  과목1  과목2  과목3  총점  평균 ");
		System.out.println("-------------------------------");

		System.out.printf("학생%d",j+1);
		System.out.printf(" %d점 ", kor_stu[j]);
		System.out.printf(" %d점 ", eng_stu[j]);
		System.out.printf(" %d점 ", mat_stu[j]);
		System.out.printf(" %d점 ", hap);
		System.out.printf(" %d점\n ", avg);
		
		
		System.out.println("\n===============================");
		System.out.println("\n-------------------------------");
		System.out.println(" 성명  과목1    과목2     과목3");
		System.out.println("-------------------------------");
		for(int i=0;i<n;i++) {
			System.out.printf(" 학생%d %3d점   %3d점   %3d점\n", i+1, kor_stu[i], eng_stu[i], mat_stu[i]);
		}	
		
		System.out.print("-------------------------------\n");


}

}
// 성적 처리
public void sungj()
{
	for (int j=0; j<n; j++) //학생 수 n명
	{
	char point = ' ';
	// 랜덤 값을 부여하여 1~100 까지 나오도록 함
	int kor = (int)(Math.random()*99+1);
	int eng = (int)(Math.random()*99+1);
	int mat = (int)(Math.random()*99+1);
	int kor1 = (int)(Math.random()*99+1);
	int eng1 = (int)(Math.random()*99+1);
	int mat1 = (int)(Math.random()*99+1);
	// 랜덤 값을 부여하여 1~10까지 나오도록 함
	int chl = (int)(Math.random()*9+1);
	int lefo = (int)(Math.random()*9+1);
	// 중간,기말 총점값 ,합, 평균값 구하기
	int tot = (kor+eng+mat)/3;
	int tot1 = (kor1+eng1+mat1)/3;
	int hap = kor+eng+mat+kor1+eng1+mat1+lefo+chl;
	int avg = tot+tot1+((lefo+chl)/3);
	//학번


    
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
	System.out.printf(" 학번 중간 기말고사 리포트 출석 총점 학점\n");
	System.out.println("  "+j+1+"  "+tot+"   "+tot1+"    "+lefo+"    "+chl+"  "+hap+"  "+point);
	System.out.print("-------------------------------\n");
}
}

public static void main(String[] arge)

{

Scanner s = new Scanner(System.in);

int n=0; //학생 수 입력


test t = new test();

while(true)

{

System.out.println("┌───────────────────┐");
System.out.println("│ 1 :    채점        │ ");
System.out.println("│ 2 :    성적처리     │ ");
System.out.println("│ 2 :    구간합 구하기 │ ");
System.out.println("│ 4 :    종료        │ ");
System.out.println("└───────────────────┘");

System.out.print("메뉴 선택 : ");

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