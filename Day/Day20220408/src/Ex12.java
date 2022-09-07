
public class Ex12 { //2딘 2줄만 출력 3단은 3개 4단은 4개 

	public static void main(String[] args) {
		for(int i=2; i<10; i++) { //행,줄
			for(int j=1; j<=i; j++) //열,칸
			System.out.println(i+"*"+j+"="+ i*j);
			
			System.out.println();//줄바꿈
	}

	}
}