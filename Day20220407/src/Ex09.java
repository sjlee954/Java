
public class Ex09 {

	public static void main(String[] args) {
		char ch = 'A'; 
		
		char lowerCase = (ch >= 'A' && ch <='Z') ? (char)(ch+32) : ch ;
				                                         // -> int를 ch형변환해줘야한다.
		System.out.println("ch:"+ch);
		System.out.println("ch to lowerCase:"+lowerCase);
	}

}
