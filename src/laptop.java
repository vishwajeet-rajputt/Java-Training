
public class  laptop {
	String brand;
	String processor;
	String gCard;
	int price;

	laptop(String brand, String processor, String gCard, int price) {
		this.brand = brand;
		this.processor = processor;
		this.gCard = gCard;
		this.price = price;
	}

	laptop(String brand, String processor, String gCard) {
		this.brand = brand;
		this.processor = processor;
		this.gCard = gCard;
	}

	laptop(String brand, String processor, int price) {
		this.brand = brand;
		this.processor = processor;
		this.price = price;
	}

	laptop(String brand, String processor) {
		this.brand = brand;
		this.processor = processor;
	}

	laptop(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}

	laptop(String brand) {
		this.brand = brand;
	}

	void data() {
		String brand="";
		String processor="";
		String gCard="";
		int price=0;
		if(this.brand!=null)System.out.println("Brand: "+ this.brand);
		if(this.processor!=null)System.out.println("Processor: "+ this.processor);
		if(this.gCard!=null)System.out.println("Graphic Card "+ this.gCard);
		if(this.price!=0)System.out.println("Price: "+ this.price);
	}
}
