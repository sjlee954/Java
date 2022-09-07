import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
//사용자가 만든 클래스를 통해서 해쉬셋에 데이터를 넣게되면 중복된 데이터를 걸러주지 못한다.
//해쉬코드와 이퀄스메서드를 적절하게 오버라이딩해서 직접 걸러줘야한다.


class Num {
	private int num;
	public Num(int num) { this.num = num; }
	
	@Override
	public String toString() {
		return String.valueOf(num);
	}
	@Override
	public int hashCode() {
		return num%3;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.num == ((Num)obj).num)
			return true;
		else 
			return false;
			
	
	}
}


public class HashSetEx2 {

	public static void main(String[] args) {
		
		
		Set<Num> set = new HashSet<Num>(); //중복된 데이터는 저장자체가 안됨.
		
		set.add(new Num(5));
		set.add(new Num(1));
		set.add(new Num(2));
		set.add(new Num(3));
		set.add(new Num(5));
	    
		
		System.out.println("cnt : "+set.size()); 
		
		for(Iterator<Num> itr = set.iterator(); itr.hasNext();) {
			System.out.print(itr.next()+"\t");
		}
		System.out.println();
		
		for(Num s : set)
			System.out.print(s+"\t");
		
	}

}
