import java.util.Iterator;
import java.util.TreeSet;

class Person2 implements Comparable<Person2> {
	String name;
	int age;
	
	Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + " : " + age;
	}

	@Override
	public int compareTo(Person2 o) {
		// TODO Auto-generated method stub
		return this.age-o.age;
	}
}
public class TreeSetEx2 {

	public static void main(String[] args) {	
		TreeSet<Person2> tree = new TreeSet<Person2>();
		tree.add(new Person2("kim",20));
		tree.add(new Person2("park",50));
		tree.add(new Person2("Lee",80));
		tree.add(new Person2("Lee",80));
		tree.add(new Person2("kim",29));
		tree.add(new Person2("kim",80));
		
		for(Person2 n : tree)
			System.out.print(n.toString()+'\t');
			
		System.out.println("\n--------------------------");
		
//		Iterator<Person> itr = tree.iterator();
//		while(itr.hasNext()) {
//			Integer n = itr.next();
//			System.out.print(itr.next().toString()+'\t');
//		}
	}

}
