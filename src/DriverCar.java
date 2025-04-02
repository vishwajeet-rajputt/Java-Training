
public class DriverCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engine engine = new Engine(1,"1.3L","Hybrid");
		Car c1 = new Car("TATA",engine);
		System.out.println(c1.getBrand());
		System.out.println(c1.getEngine().getPower());
		c1.tyres[0].setBrand("Ceat");
		System.out.println(c1.tyres[1].getBrand());
//		c1.getMirror();
		System.out.println(c1.mirrors[0]);

	}

}
