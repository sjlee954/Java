import java.util.Scanner;

public class Ex08 {  //��ø if��� ��.

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if (num >0)   
			System.out.println("���");
		else { 
			if(num < 0)
				System.out.println("����");
			else 
				System.out.println("��");
		}
		
		sc.close();
	}

}