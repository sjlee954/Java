import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {

	      int sum=0;
	      Scanner scanner = new Scanner(System.in);
	      Scanner scanner2 = new Scanner(System.in);
	      
	      
	      while(true){
	         System.out.println("숫자입력");
	         System.out.println("사칙입력(종료:x)");
	         int tmp = scanner.nextInt();
	         String tmp2 = scanner2.nextLine();
	         
	         if(tmp2.equals("*")) 
	            sum=sum*tmp;
	         if(tmp2.equals("-"))
	            sum=sum-tmp;
	         if(tmp2.equals("+"))
	            sum=sum+tmp;
	         if(tmp2.equals("/"))
	            sum=sum/tmp;
	         if(tmp2.equals("x"))
	            break;

	         System.out.println(sum);
	         continue;   
	   }
	      System.out.println("종료되었습니다");
	}

}
