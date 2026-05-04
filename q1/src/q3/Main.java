package q3;

class RBI{
	float roi() {
		// TODO Auto-generated method stub
		return 0;
	}
}

class HDFC extends RBI{
	@Override
	float roi() {
		// TODO Auto-generated method stub
		return 1;
	}
}

class ICICI extends RBI{
	@Override
	float roi() {
		// TODO Auto-generated method stub
		return 2;
	}
}

class SBI extends RBI{
	@Override
	float roi() {
		// TODO Auto-generated method stub
		return 3;
	}
}

public class Main {
	public static void main(String[] args) {
		RBI rbi;
		rbi=new HDFC();
		System.out.println(rbi.roi());
		rbi=new ICICI();
		System.out.println(rbi.roi());
		rbi= new SBI();
		System.out.println(rbi.roi());
	}
}
