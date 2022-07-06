
public class Ex02 { //시분초구하는 방법

	public static void main(String[] args) {
//		int num = 4000; //4000ch --> 시 분 초
//		
//		int h =0;
//		int n =0;
//		int s =0;
//		
//		s = num;
//		n = num%60;
//		h = n%60;
//		
//		System.out.println(num + "초는" + s + "시" + n + "분" + s +"초입니다.");
		
		//int totalminute = num/60; 
		
		int num = 4000;
		
		int hour = num/3600;
		System.out.println(num % 3600);
	    int minute = num %3600/60;
	    System.out.println(num /60);
	    int second = num%60; //40초
	    
	    System.out.println("hour: "+ hour + ",minute: "+ minute + ", second: "+ second);
	}

}


