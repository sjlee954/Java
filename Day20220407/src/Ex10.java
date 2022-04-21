
public class Ex10 {

	public static void main(String[] args) {
		//6번 
		int year = 2022;
		System.out.println( (year % 400==0) || (year % 4 ==0) && (year % 100!=0));
		System.out.println(year/4.0);
		
		//7번
		boolean powerOn = true;
		System.out.println("7:"+ !powerOn);
		//8번
		String str = "yes";
		System.out.println("8:"+str.equals("yes"));
		
		//1번
		int x = 15;
		boolean b =(x >10 && x<20);
		System.out.println(b);
		//2번
		char ch='\t';
		System.out.println((ch != ' ' || ch != '\t'));
		//3번
		char ch2='x';
		System.out.println(ch2 =='x' || ch2 =='X');
		//4번
		char ch3 = '5';
		System.out.println((ch3 >='0' && ch3 <='9'));
		//5번
		char ch4 = 'a';
		System.out.println((ch4 >='A' && ch4 <='Z') || (ch4 >= 'a' && ch4<='z'));
	}

}
