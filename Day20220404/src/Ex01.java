import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 
		 String name = scanner.nextLine();
		 
		 System.out.println(name);
		 
		 //int num = sc.nextLine();
		 
		 String input = scanner.nextLine();
		 int num = Integer.parseInt(input);
				 
		 System.out.println(num);

		 scanner.close();
	}

}
