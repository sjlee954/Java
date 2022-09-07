import java.util.Scanner;

public class Ex08 {  //중첩 if라고 함.

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if (num >0)   
			System.out.println("양수");
		else { 
			if(num < 0)
				System.out.println("음수");
			else 
				System.out.println("영");
		}
		
		sc.close();
	}

}
