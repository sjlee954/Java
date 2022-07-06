import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx01 {

	public static void main(String[] args) {
		
		
		Set<String> set = new HashSet<String>(); //중복된 데이터는 저장자체가 안됨.
		
		set.add("toy");
		set.add("box");
		set.add("robot");
		set.add("Box");
		set.add("toy");
	
		System.out.println("cnt : "+set.size()); 
		
		for(Iterator<String> itr = set.iterator(); itr.hasNext();) {
			System.out.print(itr.next()+"\t");
		}
		System.out.println();
		
		for(String s : set)
			System.out.print(s+"\t");
		
	}

}
