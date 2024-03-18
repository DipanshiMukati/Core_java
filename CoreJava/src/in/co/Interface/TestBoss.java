package in.co.Interface;

public class TestBoss implements Office, Employee {

	@Override
	public void Work() {
		System.out.println("Emplooye do his work");
	}

	@Override
	public void salary() {
	System.out.println("Boss give salary to the Manager");
	}

	@Override
	public void manager() {
	
		System.out.println("manager give salary to the employee ");
	}

	@Override
	public void HR() {
		System.out.println("i am HR of company");
	}

	public static void main(String[] args) {
		 TestBoss tb = new TestBoss();
		 tb.Work();
		 tb.salary();
		 tb.manager();
		 tb.HR();
	}
}
