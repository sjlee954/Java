import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class MainClass {

	public static void main(String[] args) throws IOException, InterruptedException {
			int count = 0;
			{
			File file = new File("data/data.txt");  //file이란 변수에 파일경로를 갖고 있음
			FileInputStream src = new FileInputStream(file);  //우의 파일에 있는 경로를 읽어오는 것.
			
			Scanner sc = new Scanner(src);
			
			while (sc.hasNext()) {  //hasNext라는 것은 '읽을 것이 있냐' 빈칸까지 읽어옴.
				String tmp = sc.next();
				System.out.printf("%s " , tmp);
				count++;
			}
			System.out.println("\ncount : " + count);

			sc.close(); //꼭해줘야함
			src.close(); //꼭해줘야함
			}
			
			
			int[] nums = new int[count];
			{
				File file = new File("data/data.txt");  
				FileInputStream src = new FileInputStream(file);  
				Scanner sc = new Scanner(src);
				
				for (int i=0;i<count;i++) {
					String tmp = sc.next();
					nums[i] = Integer.parseInt(tmp);
					
				}
				System.out.println(Arrays.toString(nums));
				sc.close(); //꼭해줘야함
				src.close(); //꼭해줘야함
			}
			//배열에서 특정 숫자 찾기
			{
				int index = -1;
				for (int i=0;i<count;i++)
					if(88 == nums[i]) {
						index = i;
						break;
					}
				System.out.println("위치는: "+ index);
			}
//				Scanner sc2 = new Scanner(System.in);
//				System.out.println("정수 하나를 입력하세요.");
//				String str = sc2.nextLine();
//				int num = Integer.parseInt(str);
//				
//				int index = -1;
//				for (int i=0;i<count;i++)
//					if(88 == nums[i]) {
//						index = i;
//						break;
//				}
//				System.out.println("위치는: "+ index);

			
			{
				//index 위치 변경 -> 0 <-> 5 위치교환
				int tmp;
				tmp = nums[0];
				nums[0]=nums[5];
				nums[5]=tmp;
				System.out.println(Arrays.toString(nums));
			}
			
			{
			 //반복적으로 i <> i+1를 교환
				for(int i=0;i<count-1;i++) {
					int tmp;
					tmp = nums[i];
					nums[i]=nums[i+1];
					nums[i+1]=tmp;
					
					Thread.sleep(1000); //1만큼 딜레이하겠다
					
					for (int j=0;j<count;j++)
						System.out.println();
					
					for (int j=0;j<count;j++)
						if(j == i+1 || j == i+0)
							System.out.printf("[%d] ",nums[j]);
						else
							System.out.printf("%d ",nums[j]);
					
				} //for문 end
//				System.out.println(Arrays.toString(nums));
			}
			
			}
	

	}

