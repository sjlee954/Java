
public class Ex02 { //시분초 구하는 코드

	public static void main(String[] args) {
		int num=4000;
		
		int hour=num/3600;
		System.out.println(num/3600);
		int minute=num%3600/60;
		System.out.println(num%3600/60);
		int s=num%60;
		
		System.out.println(num + "초는" + hour + "시간" + minute + "분" + s +"초입니다.");
	}

}
