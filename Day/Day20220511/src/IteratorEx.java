import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorEx {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		
		list.add("toy");
		list.add("box");
		list.add("robot");
		list.add("toy");
		
		//list, set, map 출력방식이 조금씩 다름 
		for(String e : list) //향상된 for문
			System.out.print(e + '\t');
		System.out.println("\n-------------------------------");
		
		
		//next() >> 다음값 반환
		//hasNext() >>가져올 데이타 있는가? 체크
		//remove() >> next()호출 통해 반환된 인스턴스 삭제
		Iterator<String> it = list.iterator(); //계속 첫번째값부터 다시 불러오고 싶으면 
		                                       //Iteraor를 또 불러와야 함.     
		while(it.hasNext()) {
			String str = it.next();
			if(str.equals("toy")) it.remove();
			System.out.print(str + '\t');
			
		}
		System.out.println("\n-------------------------------");
		Iterator<String> it2 = list.iterator();
		while(it2.hasNext()) {
			String str2 = it2.next();
			if(str2.equals("toy")) it2.remove();
			System.out.print(str2 + '\t');
			
		}
	}

}
