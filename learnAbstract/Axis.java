package learnAbstract;

public abstract class Axis implements RBI{
	/*
	 * public static void main(String[] args) { Axis a = new Axis(); }
	 */
	
	@Override
	public void aadharMandatory() {
		System.out.println("Yes, it is....");
	}

	@Override
	public void panCardMandatory() {
		System.out.println("DO with in this month");
	}
	
	public abstract void get();

}
