
public class Ex04 {

	public static void main(String[] args) {
		char c = 'a';
		for(int i = 0; i<26; i++) { //블럭{}안의 문장을 26번 반복한다.
			System.out.print(c++);   //'a' 부터 26개의 문자를 출력한다.
			
		}
		
		System.out.println(); //줄바꿈을 한다.
		
		c = 'A';
		for(int i = 0; i<26; i++)  {
			System.out.print(c++);  //System.out.println(c);
			                        //c++;
		}
		System.out.println(); //줄바꿈을 한다.
		
		c='0';
		for(int i=0;i<10;i++) {
			System.out.print(c++);
		}
		System.out.println(); //줄바꿈을 한다.
		
		float pi = 3.14159f;
		float result = (int)(pi*1000)/1000f;
		
		System.out.println(result);
		
		//반올림해서 소수점 셋째자리까지 나타내기
		
		float result2 = (int)(pi*1000+0.5)/1000f;
		System.out.println(result2);
		
		
	}

}
