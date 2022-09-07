import java.util.Scanner;

public class Ex03 { //if문사용해서 다섯개의 정수를 입력받아 가장 큰 수를 출력하는 프로그램 작성. while문도 가능 

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num, max =0;
		String tmp;
		
		System.out.println("정수 5회 입력(0~100)");
		
		for(int i=0; i<5 ; i++) {
			tmp = sc.nextLine();
			num = Integer.parseInt(tmp);

			if (num<0 || num>100) {
				System.out.println("0~100사이의 정수를 입력하세요.");
				--i;
				continue;
				}
			
			if(max < num ) 
				max = num;
			
		} //end of for
		
		System.out.println("최댓값 : "+max);
	}

}
