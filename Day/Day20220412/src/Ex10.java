
public class Ex10 {

	public static void main(String[] args) {

		int n1,n2;
		n1 = 10;
		n2 = 20;
		
		System.out.println("before"+n1+","+n2);
		
		swap(n1, n2); //두 수 교환
		
		System.out.println("after"+n1+","+n2); //지역변수기 떄문에 함수내에서만 바뀜.

	}
	
	//입 O, 출 X ==> 두 수를 교환
	public static void swap(int n1, int n2) {
		
		int tmp; //지역변수
		
		tmp=n1;
		n1=n2;
		n2=tmp;
		
		System.out.println("after"+n1+","+n2);
		
	}
}
