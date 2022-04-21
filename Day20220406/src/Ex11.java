import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		System.out.print("점수를 입력해주세요.>");
		
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		int num = Integer.parseInt(tmp);
		// int num = sc.nextInt();  11,12번 줄이 10번줄과 같다.
		
		switch(num) {
		case 1 :
			System.out.println("1입력");
			break;
		case 2 :
			System.out.println("2입력");			
			break;  //적절하게 쓰고 시ㅍ은곳에 ㅆ쓸 수 있음
		case 3 :
			System.out.println("3입력");
			break;
		case 4 :
			System.out.println("4입력");
			break; 
		default :
			System.out.println("그 외 입력");	
		
		}
			
		sc.close();
	}

}
