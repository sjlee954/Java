import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx2 {

	public static void main(String[] args) {
//		HashMap<Integer, String> map = new HashMap<Integer, String>(); //sort X
		TreeMap<Integer, String> map = new TreeMap<Integer, String>(); //sort O
		
		
		map.put(3, "kim");
		map.put(4, "hong");
		map.put(4, "Lee");
		map.put(4, "Lee2");
		map.put(16, "Lee2");
		map.put(5, "park");
		map.put(20, "park");
		map.put(6, "kim");
		map.put(4, "kim");
		

		
		System.out.println(map);
		System.out.println(map.get(5));

		//map자체를 반복문 돌릴 수가 없다. key만 뽑아서 반복문을 돌리고 key만 뽑던지 value만 뽑던지 할 수 있따.
		
		
		Set<Integer> set = map.keySet();
		for(Integer n : set) //key 출력
			System.out.print(n+"\t");
		System.out.println("\n-----------------------------");
		
		for(Integer n : set) //value 출력
			System.out.print(map.get(n)+"\t");
		
		System.out.println("\n-----------------------------");

		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext())
			System.out.print(map.get(itr.next())+"\t");
			
	}

}
