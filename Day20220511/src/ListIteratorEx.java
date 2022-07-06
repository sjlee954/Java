import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("toy","box","robot","box");

//		list.add("box");  그냥 추가하면 ArrayList에서 에러남 
		
		list = new ArrayList<String>(list);
//		list.add("aaa");
//		System.out.println(list);
		
		ListIterator<String> it  = list.listIterator(); //양방향
		while(it.hasNext()) {
			String str = it.next();
			System.out.print(str+'\t');
		}
		
		System.out.println();
		
		while(it.hasPrevious()) {
			String str2 = it.previous();
			System.out.print(str2+'\t');
			 
		}
		System.out.println();
		for(Iterator<String> itr =list.iterator(); itr.hasNext();)
			System.out.print(itr.next()+'\t');
//		Iterator<String> it  = list.Iterator(); //양방향
//		while(it.hasNext()) {
//			String str = it.next();
//			System.out.print(str+'\t');
//		}
	
	}

}
