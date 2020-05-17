package week1.day2;

public class LearnConstructor {
	int j; // class level = 0
	// constructor
	public LearnConstructor() { 
		System.out.println("Hi im in cons"); 
	}
	public LearnConstructor(String i, int j, float f) { // overloading
		System.out.println("I from cons " +i);
		System.out.println("I have i as "+i); 
	}
	public LearnConstructor(int i) { // overloading
		System.out.println("I from cons " +i);
		j = i;
		System.out.println("I have i as "+i); 
	}

	public void hi() {
		int i =1;
		System.out.println("local var "+i);
		System.out.println("Instance var "+j);
	}

	public static void main(String[] args) {
		LearnConstructor lc = new LearnConstructor(5);
		lc.hi();
	}



}
