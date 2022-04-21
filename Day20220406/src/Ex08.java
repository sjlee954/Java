import java.util.Scanner;

public class Ex08 { //중첩if라고 함.
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		if(num>0) 
			System.out.println("양수");
		else {
			if(num==0)
				System.out.println("영");
			else
				System.out.println("음수");
		}
		scanner.close();
	}
	
}
