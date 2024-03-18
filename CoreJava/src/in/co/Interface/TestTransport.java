package in.co.Interface;

public class TestTransport  implements Transport, Car, Bus, Bike{

	@Override
	public void bike_name() {
		System.out.println("Royal");
	}

	@Override
	public void bike_type() {
	System.out.println("Bullet");
		
	}

	@Override
	public void bus_name() {
		System.out.println("City buses");
		
	}

	@Override
	public void bus_type() {
		System.out.println("CNG");
		
	}

	@Override
	public void car_name() {
		System.out.println("Alto");
	}
	@Override
	public void All() {
		System.out.println("all types");
	}

	@Override
	public void car_type() {
		System.out.println("petrol");
	}
	public static void main(String[] args) {
		
		TestTransport t = new TestTransport();
		t.All();
		t.bike_name();
		t.bike_type();
		t.bus_name();
		t.bus_type();
		t.car_name();
		t.car_type();
		
		
	}
}
