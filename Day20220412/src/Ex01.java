
public class Ex01 { //함수를 쓰는 이유? ①수정쉽고,오류적다. ②기능별로 분류하기위해서(상품,판매,회계등.)

	public static void main(String[] args) {
		//함수에서 입력(X), 출력(X)
		System.out.println("main() 함수!!");
		sub2(); //함수 호출
		System.out.println("main()2 함수!!");
	}
	//함수가 존재하면 반드시 다른 곳(main등에서) 호출을 해야한다.
	public static void sub() { //public은 아무나 갖다써 private는 차후에
		System.out.println("서브 함수 입니다."); //호출된 후 제어권은 다시 호출했던 곳으로
		
	}
	public static void sub2() { //public은 아무나 갖다써 private는 차후에
		sub();
		System.out.println("서브2 함수 입니다."); //호출된 후 제어권은 다시 main으로
		System.out.println("안녕하세요.");
	}
	
}
//메인함수 서브2함수 서브함수 메인2함수
