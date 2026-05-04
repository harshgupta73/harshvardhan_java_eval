package q5;

import java.util.Comparator;

public class AgeComparator implements Comparator<Emp>{

	@Override
	public int compare(Emp o1, Emp o2) {
		// TODO Auto-generated method stub
		if(o1.age<o2.age) {
			return -1;
		}
		else if(o1.age>o2.age) {
			return 1;
		}
		return 0;
	}

}
