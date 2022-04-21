
public class Ex07 {

	public static void main(String[] args) {
		String str1 = "abc";
		//String str11= "abc"; //str1에 저장되어있는 주소값을 갖다 쓴 거
		String str2 = new String("abc"); //새로 만든 것
		
		//클래스는 객체를 생성해야 한다. new연산자로 생성
		
		System.out.printf("\"abc\"==\"abc\"? %b%n", "abc"=="abc"); 
		System.out.printf("str1==\"abc\"? %b%n",   str1=="abc");
		System.out.printf("str2==\"abc\"? %b%n",   str2=="abc"); //주소값이 다르기 떄문
		System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc")); //주소값은 다르지만 내용이 같음.
		System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc")); 
		System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
		System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));
	}

}
