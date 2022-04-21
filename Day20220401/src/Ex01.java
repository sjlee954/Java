import java.util.Scanner;

public class Ex01 { //이름, 나이를 출력한다.

	public static void main(String[] args) {
		int age;
		String name;
		
		Scanner scanner = new Scanner(System.in);
		age = scanner.nextInt();
		name = scanner.nextLine();
		
		System.out.printf("name: %s, age : %d%n", name , age);
		System.out.println("name:" + name + " age:" + age);
		
		scanner.close();
	}

}
