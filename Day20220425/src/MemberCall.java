
class MemberCall {
	int iv = 10;
	static int cv = 20;
	
	int iv2 = cv;
	//static int cv2 = iv; //에러. 클래스변수는 인스턴스 변수를 사용할 수 없음.
	static int cv2 = new MemberCall().iv;   //이처럼 생성해야 사용가능.
	
	static void staticMethod() {
		System.out.println(cv);
//		System.out.println(iv); 에러. 클래스 메소드에서는 인스턴스변수 사용불가
		MemberCall c = new MemberCall();
		System.out.println(c.iv);
	}
	
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv);
		
	}
	
	static void staticMethod2() {
		staticMethod();
//		instanceMethod(); 에러.
		MemberCall c = new MemberCall();
		c.instanceMethod1();
	}
	void instanceMethod2() {
		staticMethod();
		instanceMethod1();

	}

}