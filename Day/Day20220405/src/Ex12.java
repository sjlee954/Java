
public class Ex12 { //3-28

	public static void main(String[] args) {
		int x = 0xAB, y = 0xF;
		
		System.out.printf("%s%n" , Integer.toBinaryString(x));
		System.out.printf("%s%n" , Integer.toBinaryString(y));
		
		
		System.out.printf("x = %#X \t\t%s%n", x, toBinaryString(x));
		System.out.printf("y = %#X \t\t%s%n", y, toBinaryString(y));
		System.out.printf("%#X | %#X = %#X \t%s%n", x, y, x | y, toBinaryString(x | y));
		System.out.printf("%#X & %#X = %#X \t%s%n", x, y, x & y, toBinaryString(x & y));
		System.out.printf("%#X ^ %#X = %#X \t%s%n", x, y, x ^ y, toBinaryString(x ^ y));
		System.out.printf("%#X ^ %#X ^ %#X = %#X %s%n", x, y, y, x ^ y, toBinaryString(x ^ y ^ y));
		
	} //main의 끝

	static String toBinaryString(int x) { //10진 정수를 2진수로 변환하는 메서드
		String zero = "00000000000000000000000000000000";
		String tmp = zero + Integer.toBinaryString(x);
		
		return tmp.substring(tmp.length ()-32);  //8자리 뒤에서부터(9자리) 돌려준다
		
		
		
	}

		}

