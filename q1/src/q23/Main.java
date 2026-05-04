package q23;

class Hobbies{
	String h1;
	String h2;
	public Hobbies(String h1, String h2) {
		super();
		this.h1 = h1;
		this.h2 = h2;
	}
	@Override
	public String toString() {
		return "Hobbies [h1=" + h1 + ", h2=" + h2 + "]";
	}
}

class Address{
	String area;
	String city;
	public Address(String area, String city) {
		super();
		this.area = area;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [area=" + area + ", city=" + city + "]";
	}
}


class Emp{
	Hobbies hobbies;
	Address address;
	
}
public class Main {
	public static void main(String[] args) {
		
	}
}
