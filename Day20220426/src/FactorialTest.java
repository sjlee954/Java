
public class FactorialTest {
	public static void main(String[] args) {
	System.out.println(factorials(4));
	

}
	static long factorials(int n) { //n =4
		
		if ( n==1) 
			return 1;
		
		return n * factorials(n-1); //메서드 자신을 호출한다
	}
		
}
