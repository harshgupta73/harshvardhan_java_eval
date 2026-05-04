package q4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Emp implements Serializable{
	int id;
	String name;
	double sal;
	public Emp(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
}

public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp(1, "harsh", 12000);
		
		try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("demo.txt"))) {
			objectOutputStream.writeObject(objectOutputStream);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
//		try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("demo.txt"))) {
//			Emp emp2=(Emp) inputStream.readObject();
//			System.out.println(emp2);
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println(e);
//		}
	}
}
