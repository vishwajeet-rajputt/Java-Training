
public class Car {
	private String brand;
	
	Mirror [] mirrors =new Mirror[4];

	private Engine engine;
	Tyre [] tyres = new Tyre[4];
	
	{
		for(int i=0;i<tyres.length;i++) {
			tyres[i]= new Tyre("MRF",18);
		}
		
	}
 
	public Engine getEngine() {
		return this.engine;
	}

	public Car(String brand,Engine engine) {
		this.brand = brand;
		this.engine=engine;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	void getMirror() {
		mirrors = new Mirror[4];
		for(int i=0;i<mirrors.length;i++) {
			mirrors[i]=new Mirror("TATA");
		}
	}

}
