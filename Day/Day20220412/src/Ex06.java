
public class Ex06 {

	public static void main(String[] args) { //구구단
		int num =2;
		
		gugudan(num);
		gugudan2(num);
		System.out.println("프로그램 종료!!");
		
		
	} 
	public static void gugudan(int num) {
		System.out.println("입력한"+num+"단 출력");

		for (int i=1;i<=9;i++) {
			System.out.println(num +"*"+i+"="+ num*i);
		}
	}

	public static void gugudan2(int num) {
			System.out.println("입력한"+num+"단 출력");

			for (int i=1;i<=num;i++) {
				System.out.println(num +"*"+i+"="+ num*i);
			}
	}		

}
