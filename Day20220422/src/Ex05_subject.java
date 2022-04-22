import java.util.Scanner;

public class Ex05_subject { //5명 학생 두 과목(영어,수학)을 입력받아서 과목별 평균, 학생별평균을 구하는 프로그램

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num =5; //인원수
		
		int[][] subject = new int[num][2]; //점수
		int[] totalStudent = new int[num]; //학생별 점수
		int[] totalSubject = new int[2];   //과목의 점수
		
		System.out.printf("%d명 영어,수학 점수 입력.\n",num);
		
		for(int i=0;i<num;i++) {
			System.out.printf("%d번 영어: ",i+1);
			subject[i][0] = sc.nextInt();
			System.out.printf("%d번 수학: ",i+1);
			subject[i][1] = sc.nextInt();
			System.out.println();
			
				
			totalStudent[i] = subject[i][0]+ subject[i][1]; //학생합계
			totalSubject[0] += subject[i][0]; //영어합계
			totalSubject[1] += subject[i][1]; //수학합계
		}
		
		System.out.println("No.   영어    수학   평균");
		for(int i=0;i<num;i++) 
			System.out.printf("%2d %6d %6d %6.1f\n",i+1,subject[i][0],subject[i][1],(double)(totalStudent[i]/2));
			
			System.out.printf("평균 %6.1f %6.1f\n",(double)totalSubject[0]/num,
					                              (double)totalSubject[1]/num);
		
	}

}
