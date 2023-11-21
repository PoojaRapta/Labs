package lab;

class Bike {

	int topspeed;
	double cc;
	char series;
	String colour;

	public Bike(String colour) {
		System.out.println("this is single parameter constructor");
		System.out.println("Colour:" + colour);

	}

	public Bike(int topspeed, double cc, char series, String colour) {
		System.out.println("this is   constructor with four parameters");
		System.out.println("topspeed:" + topspeed);
		System.out.println("cc:" + cc);
		System.out.println("series:" + series);
		System.out.println("Colour:" + colour);

	}

}

public class BikeTest {
	public static void main(String[] args) {

		Bike bike = new Bike(180, 345.5, 'z', "Blue");
		// calling the constructor with four parameters
	

	}

}
