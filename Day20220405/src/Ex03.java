
public class Ex03 { //예제 3-13

	public static void main(String[] args) {
		char c1 = 'a';
		
		// char c2 = c1 + 1; -> char(문자) + int(정수) = int가 되므로 형변환을 해줘야함!
		
		char c2 = (char)(c1 + 1);
		
		char c3 = 'a' -32;  //97-32 = 65 -> A
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		
	}

}
