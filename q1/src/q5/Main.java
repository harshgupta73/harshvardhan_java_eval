package q5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Emp implements Comparable<Emp>{
	int id;
	String name;
	int age;
	public Emp(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public int compareTo(Emp o) {
		// TODO Auto-generated method stub
		if(this.id<o.id) {
			return -1;
		}
		else if(this.id>o.id) {
			return 1;
		}
		return 0;
	}
}

public class Main {
	public static void main(String[] args) {
		Emp emp1 = new Emp(1, "harsh", 22);
		Emp emp2 = new Emp(3, "rohit", 12);
		Emp emp3 = new Emp(4, "omkar", 11);
		Emp emp4 = new Emp(2, "sara", 23);
		
		List<Emp> emps= new ArrayList<Emp>();
		emps.add(emp1);
		emps.add(emp2);
		emps.add(emp3);
		emps.add(emp4);
		
		Iterator<Emp> iterator = emps.iterator();
		while(iterator.hasNext()) {
			Emp emp=iterator.next();
			System.out.println(emp);
		}
		
		Collections.sort(emps);
		//after sorting
		System.out.println("after sorting via comparable with id");
		Iterator<Emp> iterator2 = emps.iterator();
		while(iterator2.hasNext()) {
			Emp emp=iterator2.next();
			System.out.println(emp);
		}
		
		Collections.sort(emps, new AgeComparator());
		//after sorting
		System.out.println("after sorting via comparator with age");
		Iterator<Emp> iterator3 = emps.iterator();
		while(iterator3.hasNext()) {
			Emp emp=iterator3.next();
			System.out.println(emp);
		}
		
	}
}
