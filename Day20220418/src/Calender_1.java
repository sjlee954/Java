import java.util.*;

public class Calender_1{
   public static void main(String[] args){
       
       int year=0, month=0;
       Scanner scan=new Scanner(System.in);
       System.out.println("년도 입력: ");
       year=scan.nextInt();
       
       System.out.println("월 입력: ");
       month=scan.nextInt();
       
       //출력
       String[] strWeek= {"일","월","화","수","목","금","토"};
       System.out.println(year+"년도 "+month+"월");
       
       for(String week:strWeek)
       {
           System.out.print(week+"\t");
       }
       
       int total=(year-1)*365
                +(year-1)/4
                -(year-1)/100
                +(year-1)/400;
       
       //전달
       int[] lastDay= {31,28,31,30,31,30,31,31,30,31,30,31};
       if((year%4==0 && year%100!=0)||(year%400==0)) //윤년 => 2월 29일
           lastDay[1]=29;
       else
           lastDay[1]=28;
       for(int i=0;i<month-1;i++)
       {
           total+=lastDay[i];
       }
       //1일자 요일의 시작점을 찾아야함. 
       total++; //저번달까지의 합에 +1을 한 것임.
       
       int week=total%7;
      // System.out.println(week);
       
       //달력 출력
       System.out.println();
       
       for(int i=1;i<=lastDay[month-1];i++) //4월입력했을 경우 : lastDay[3] = 30
       {
           if(i==1) {
              for(int j=0;j<week;j++) //j=0,1,2,3,4
              {
               System.out.print("\t");
              } //안의 for문 end
           } //if(i==1)문 end
           System.out.printf("%2d\t",i);
           week++;
           if(week>6)
           {
               week=0;
               System.out.println();
               } //if(week>6)문 end
       } //바깥 for문 end
   }
}