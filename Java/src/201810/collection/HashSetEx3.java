package collection;

import java.util.*;
public class HashSetEx3 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc");
		set.add(new Person("yejin",19));
		set.add(new Person("yejin",19));
		
		System.out.println(set);
	}
}

class Person {
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name+":"+age;
	}
	
	public boolean equals (Object o) {
		if (o instanceof Person) {
			Person tmp = (Person) o;
			return name.equals(tmp.name) && age == tmp.age;
		}
		return false;
	}
	
	public int hashCode() {
		return Objects.hash(name,age);
	}
}
