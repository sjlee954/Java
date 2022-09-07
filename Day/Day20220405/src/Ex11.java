
public class Ex11 {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
		if ( a>20 && b>5)     //  if ( a>20(1시간) && b>5(5초) ) ->  if ( b>5(5초) && a>20(1시간) ) 
			                  // 연산시간 짧은 것을 앞쪽에 배치
			System.out.println("만족");
		
		System.out.println("불만족");
	}

}
