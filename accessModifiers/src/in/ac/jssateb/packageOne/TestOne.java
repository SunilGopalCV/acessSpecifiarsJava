package in.ac.jssateb.packageOne;

public class TestOne {

	public int i = 5;
	
	public void display() {
		System.out.println("Access Specification Example");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestOne t1 = new TestOne();
		System.out.println(t1.i);
		t1.display();
	}

}
