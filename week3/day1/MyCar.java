package week3.day1;

public class MyCar {

	public static void main(String[] args) {
		Car c = new Car();
		c.name();
		c.applyAcc();
//		c.applyBrake();
		
		BMW bmw = new BMW();
		bmw.applyBrake();
		bmw.name();
		
		Car audi = new AUDI(); // down casting
		audi.applyBrake();
		audi.name();
		
		RBI ab = new Axis();
		ab.aadharMandatory();
		
		
		
		
	}

}
