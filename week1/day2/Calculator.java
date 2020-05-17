package week1.day2;

public class Calculator {

	int a;
	int b;
	public Calculator(int a, int b) {
		this.a = a;
		this.b =b;
	}
	
	void add() {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
	Calculator cal = new Calculator(8,5);
	cal.add();
	}

}




