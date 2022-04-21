
public class Ex08 {

	public static void main(String[] args) {

		char ch = 'z'; //'z'=122
		
		System.out.println((int)(ch));
		
		boolean b = ('0'<= ch && ch <='9') || ('A'<= ch && ch <='Z' || 'a' <=ch && ch <= 'z');
		
		System.out.println(b);
	}

}
