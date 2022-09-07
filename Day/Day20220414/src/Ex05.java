import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String s3 = new String("java");
		String s4 = sc.nextLine();
		
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));

		sc.close();
	}

}
