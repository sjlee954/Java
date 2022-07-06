
public class Ex07 {

	public static void main(String[] args) {
		int n = 3;
		
		gugudan2(n);
		
		
	}

//	//입력 X , 출력 X
	public static void gugudan() {
		
		int n= 3;
		
		System.out.println("입력한"+n+"단 출력");
		for (int i =1; i<=9;i++) 
			System.out.println(n*i);
		}
	

	//입력 O , 출력 X
	public static void gugudan2(int n) {
	
//		int n= 3;
	
		System.out.println("입력한"+n+"단 출력");
		for (int i =1; i<=9;i++) 
		System.out.println(n*i);
	
	}
}
