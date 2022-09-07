import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class HashSetEx4 {

	public static void main(String[] args) {
		Set set = new HashSet();
		
		for(int i=0;set.size()<6; i++) {
			int num = (int)(Math.random()*45)+1;
			set.add(num); //new Integer(num)으로 해도 상관없음.
		}
		
		List list = new LinkedList(set);
		Collections.sort(list);  //set을 바로 정렬x 리스트에 담아서 리스트를 정렬
								 //Collection.sort(set)하게 되면 오류가 뜬다.			
		System.out.println(list);
	}

}
