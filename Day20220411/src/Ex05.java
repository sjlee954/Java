import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) { //p.172 4-27
		int num;
		int sum=0;
		boolean flag = true; //while문의 조건식으로 사용될 변수
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("합계를 구할 숫자를 입력하세요.(끝내려면 0을 입력)");		
		String tmp = scanner.nextLine();
		num = Integer.parseInt(tmp);
		
		
		while (flag) {
			System.out.print(">>");
			if(num!=0) {  //num이 0이 아니면 sum에 더한다.
				sum+=  num;
			} else {
				flag = false;  //num이 0이면, flag의 값을 false로 변경
			}
		} //while문 end
		
		System.out.println("합계: "+sum);
		
		scanner.close();
	}

}
