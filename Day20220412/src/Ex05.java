
public class Ex05 {

	public static void main(String[] args) {
		// //함수에서 입력(O), 출력(O)
		int num = 2;
		int num2 = 5;
		
		System.out.println("main() 함수!!");
		
		int result = sub(num,num2);
		
		System.out.println("결과 값은: "+result);
	}
	public static int sub(int num, int num2) {
		int num3 = num*num2;
		
		System.out.println("sub() 함수...");
		
		return num3; //num3에 저장안하고 return num*num2 이렇게 바로보내도 됨.
	}
}
