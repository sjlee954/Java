import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class HashSetLotto {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc");
		set.add(new Person("David",10));
		set.add(new Person("David",10));

		System.out.println(set);
	}

}

class Person{
	String name;
	int age;
	
	Person(String name, int age) {
		this.name =name;
		this.age = age;
		
	}
	
	@Override
	public String toString() {
		return name+":" +age;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name,age);
	}
	@Override
	public boolean equals(Object obj) {
		Person tmp = (Person)obj;
		return name.equals(tmp.name) && age == tmp.age ? true : false;
	}
}