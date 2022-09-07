import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		System.out.print("점수를 입력하세요.>");
		
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();  //화면을 통해 입력받은 내용을 tmp에 저장
		int score = Integer.parseInt(tmp);  //입력받은 문자열(tmp)를 숫자로 변환
		
	    
		switch(score/10) {   //점수의 나누기 10을 해주면 됨
			case 9:  
			System.out.println("A");
			break;
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			case 6:
				System.out.println("F");
				break;
		}
		
		sc.close();
	}

}
