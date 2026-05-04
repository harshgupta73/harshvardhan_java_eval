package q1;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		System.out.println("*************For each************");
		Vector<String> vector = new Vector<String>();
		vector.add("harsh");
		vector.add("rohit");
		vector.add("omkar");
		vector.add("sumit");
		
		//for each
		for(String s:vector) {
			System.out.println(s);
		}
		
		System.out.println("*************LIST************");
		//iterator
		List<String> list = new  ArrayList<String>();
		list.add("harsh");
		list.add("rohit");
		list.add("omkar");
		list.add("sumit");
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String s=iterator.next();
			System.out.println(s);
		}
		
		//enumerator
		System.out.println("*************Enumeration************");
		Enumeration<String> enumeration= vector.elements();
		while(enumeration.hasMoreElements()) {
			String s=enumeration.nextElement();
			System.out.println(s);
		}
		
		
		//list iterator next
		System.out.println("*************List iterator next************");
		List<String> list2 = new LinkedList<String>();
		list2.add("harsh");
		list2.add("rohit");
		list2.add("omkar");
		list2.add("sumit");
		
		ListIterator<String> iterator2 = list2.listIterator();
		while(iterator2.hasNext()) {
			String s=iterator2.next();
			System.out.println(s);
		}
		//list iterator previous
		System.out.println("*************List iterator previous************");
		while(iterator2.hasPrevious()) {
			String s=iterator2.previous();
			System.out.println(s);
		}
		
		
		
	}
}
