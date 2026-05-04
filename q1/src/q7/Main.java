package q7;

class VoteException extends Exception{
	
}

class Vote{
	void vote(int age) {
		// TODO Auto-generated method stub
		try {
			if(age<18) {
				throw new VoteException();
			}else {
				System.out.println("You can cote");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Vote v = new Vote();
		v.vote(17);
	}
}
