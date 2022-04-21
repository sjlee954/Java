
public class Ex10 {

	public static void main(String[] args) {
		
		int n1,n2;
		n1 = 10;
		n2 = 20;
		
		System.out.println("before "+n1+","+n2);
		
		swap(n1,n2);
		
//		System.out.println("after "+n1+","+n2); //두 변수가 바뀌지 않음 tmp는 swap함수 내의 지역변수기 때문.
	
	}
	public static void swap(int n1, int n2) {
		int tmp;
		
		tmp=n1;
		n1=n2;
		n2=tmp;
		
		System.out.println("after "+n1+","+n2);
		 
	}
}
