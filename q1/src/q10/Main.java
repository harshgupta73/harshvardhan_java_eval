package q10;

import java.util.Objects;

class Emp implements Cloneable{
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
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name, sal);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(sal) == Double.doubleToLongBits(other.sal);
	}
}

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		Emp emp = new Emp(1, "harsh", 12000);
		Emp emp2 = (Emp) emp.clone();
		System.out.println(emp);
		System.out.println(emp2);
		
		System.out.println(emp.equals(emp2));
		
	}
}	
