
public class Ex07 { //3-23

	public static void main(String[] args) {
		String str1= "abc";  //참조형
		//String str11 = "abc"; //갖다 쓴거
		String str2 = new String("abc"); //별개의 것, 새로 만든거
		
		//클래스는 객체를 생성해야한다. new 연산자로 생성
		
		System.out.printf("\"abc\"==\"abc\"? %b%n", "abc"=="abc");
		System.out.printf("str1==\"abc\"? %b%n",   str1=="abc");
		System.out.printf("str2==\"abc\"? %b%n",   str2=="abc");
		System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
		System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
		System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
		System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));
	}

}
