
public class Ex05 {

	public static void main(String[] args) {
		//함수에서 입력(O), 출력(O)
		int num =5;
		int num2 =10;
		
		System.out.println("main() 함수!!");
		
	 	int result = sub(num,num2); //함수 호출 -->인자값 또는 인수
	 	
		System.out.println("결과 값은 "+result); 
	}
	
	public static int sub(int num, int num2) { //-->매개변수
		int inum = num*num2;
		System.out.println("sub() 함수..."); 
		return inum; //return num*num2 이렇게 바로보내도 됨.
	}

}
