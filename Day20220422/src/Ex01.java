import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		
		int count =0;
		{
			File file = new File("data/suwon.txt");
			FileInputStream infile = new FileInputStream(file);
			Scanner sc = new Scanner(file);
			
			while (sc.hasNextLine()) {
				sc.nextLine();
				count++;
			}
			count--;
			System.out.println("count: "+count);
			sc.close();
			infile.close();
		}
			
		String[] Do = new String[count];
		String[] Si = new String[count];
		String[] Gu = new String[count];
		String[] Dong = new String[count];
		int[] numBreed = new int[count];
		int[] numDog = new int[count];
		int[] owner = new int[count];
		String[] manage = new String[count];
		int[] manageCall = new int[count];
		int[] dataDate = new int[count];
		{
			File file = new File("data/suwon.txt");
			FileInputStream infile = new FileInputStream(file);
			Scanner sc = new Scanner(file);
			
			int total =0;
			sc.nextLine(); //첫번째 줄 읽어서 버린다.
			for(int i=0;i<count;i++) {
				String line = sc.nextLine();
				
				String[] tokens = line.split(","); //라인의 구분점 ","
				Do[i] = tokens[0];
				Si[i] = tokens[1];
				Gu[i] = tokens[2];
				Dong[i] = tokens[3];
				numBreed[i] = Integer.parseInt(tokens[4]);
				total += numBreed[i];
				
//				numDog[i] = Integer.parseInt(tokens[5]);
//				owner[i] = Integer.parseInt(tokens[6]);
//				manage[i] = tokens[7];
//				manageCall[i] = Integer.parseInt(tokens[8]);
//				dataDate[i] = Integer.parseInt(tokens[9]);
			}
			for(int i =0; i<count; i++)
			System.out.printf("%s %s %s %6s %d\n",Do[i],Si[i],Gu[i],Dong[i],numBreed[i]);
			System.out.println("total: "+total);
		}
		
	}

}

