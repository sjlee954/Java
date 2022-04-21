import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		if(str.equals("yes"))
			System.out.println("정답입니다.");
			System.out.println("1111");   //단독이라고 봄. 무조건 실행됨.
			
//		if(str.equalsIgnoreCase("yes"))         대소문자 구분 x
//			System.out.println("정답입니다.");
		
		sc.close();
	}

}
