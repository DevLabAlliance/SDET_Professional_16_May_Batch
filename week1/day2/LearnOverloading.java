package week1.day2;

public class LearnOverloading {
	
	
	static void emp1() {
		System.out.println(10000);
	}
	
	static int emp2() {
		return emp2();
	}
	
	static boolean sendSms(){
		System.out.println("Sending msg 101");
		return true;
	}
	// overloading
	static boolean sendSms(String contact){
		System.out.println("Sending msg "+contact);
		return true;
	}
	static boolean sendSms(int number) {
		System.out.println("Sending msg "+number);
		return false;
	}
	
	static String getName(){
		String mobileName = "OP";
		return mobileName;
	}
	
	public static void main(String[] args) {
		String mobName = getName();
		System.out.println(mobName);
		System.out.println(getName());
		int bonus = 1000;
		System.out.println(emp2() +bonus);
		sendSms(123);
//		System.out.println(emp1());
		
	}

}
