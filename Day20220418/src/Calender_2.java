import java.util.Scanner;

public class Calender_2 {

	public static void main(String[] args) {
		int year=0, month=0, week=0, day=0, i=0; 
	      
	      Scanner sc = new Scanner(System.in);
	      year = sc.nextInt();
	      month = sc.nextInt();
	      
	      System.out.println(year+"년도 " + month+"월");
	      
	      int[] last = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	      
	      if ((year%4 == 0 && year%100!=0) || year%400==0) {
	         last[1] = 29;
	      } else {
	         last[1] = 28;
	      }
	      
	      
	      day = (year-1)*365 + (year-1)/4 - (year-1)/100 + (year-1)/400;
	       
	      for (i = 0; i < month-1; i++) {
	         day+=last[i];
	      } 
	      week=day%7;
	      
	      System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t\n", "월", "화", "수", "목", "금", "토", "일");  
	      
	      for (i = 0; i < week; i++) {
	         System.out.print("\t");
	      }
	      
	      for (i = 1; i <= last[month-1]; i++) {
	         System.out.printf("%d\t", i);
	         week++;
	         if (week%7==0) {
	            System.out.println();
	         }
	         
	      }

	}

}
