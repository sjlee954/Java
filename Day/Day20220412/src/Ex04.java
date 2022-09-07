
public class Ex04 {

	public static void main(String[] args) {
		//함수에서 입력(X), 출력(O)
		int num = 2;
		int num2 = 5;
		
		System.out.println("main() 함수!!");
		
	 	double n = sub(); //함수 호출
		           //이 sub();자리에 return값이 대체를 하게 됨.
	 	
		System.out.println("결과 값은 : "+n); 
	}
	//함수가 존재하면 반드시 다른곳에서 호출을 해야한다.
	//void 자리에는 반환형이 온다.-->void는 반환값이 없다는 것을 명시
	//sub는 함수 이름 --> 변수 이름 준에서 명명한다.
	public static double sub() 
	{ // return자료형과 void자리 자료형이 동일해야함.
		double dnum = 12.5;
		
		System.out.println("sub() 함수..."); 
		
		return dnum;
	}

}
