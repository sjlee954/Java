
public class Ex08 {

	public static void main(String[] args) {
		int a = 1;  
		int b = 0;  
		int i = 20;
		
		System.out.println(a>0 && b>0);
		System.out.println(a>0 || b>0);
		System.out.println( !(a>0 || b>0));
		
		System.out.println( i%2 ==0 || (i%3 ==0 && i%6 != 0) );
		
	}

}
