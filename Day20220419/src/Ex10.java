import java.util.Arrays;

public class Ex10 {

	public static void main(String[] args) {
		char[] hex = {'C','A','F','E'}; //변환하고자 하는 16진수를 배열hex에 나열.
		                                //0~9,A~F까지가 16진수
		
		String[] binary = { "0000" , "0001", "0010", "0011",
				            "0100", "0101", "0110", "0111",
				            "1000", "1001", "1010", "1011",
				            "1100", "1101", "1110", "1111"};
		
		String result="";
		
		for (int i=0;i<hex.length;i++) {
			if (hex[i]>='0' && hex[i] <='9') { //0~9까지이면
				result += binary[hex[i]-'0'];  //'8'-'0'의 결과는 8이다
			} else { //A~F이면
				result += binary[hex[i]-'A'+10]; //'C'-'A'의 결과는 2
			}
		}
		                              // String(char[] value)
		System.out.println("hex: "+new String(hex));
		System.out.println("binary: "+result);
		
	}

}
