
public class Ex04 { // 3-14

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
		
		System.out.println();

		c = '0';
		for(int i = 0; i<10; i++) {
			System.out.print(c++);
		}
		System.out.println();
		
		//----------------------------------------------------------------
		
		float pi = 3.14159f;
		
		float result = (int)(pi*1000)/1000f;
		System.out.println(result);
		
		//3.142
		
		float result2 = (int)(pi*1000 + 0.5)/1000f; //0.5를 더해주면 반올림
		
		System.out.println(result2);
		
		//----------------------------------------------------------------
		
	
		
		
		
		
		
		
		
	}

}
