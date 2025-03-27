
public class lapDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		laptop l1 = new laptop("ASUS","i5","IRIS XE",55000);
		l1.data();
		System.out.println("==================");
		laptop l2 = new laptop("Lenovo","i3","IRIS XE");
		l2.data();
		System.out.println("==================");
		laptop l3 = new laptop("Asus","AMD RYZEN 5",40000);
		l3.data();
		System.out.println("==================");
		laptop l4 = new laptop("MacBook","M2 Pro");
		l4.data();
		System.out.println("==================");
		laptop l5 = new laptop("Dell",25000);
		l5.data();
		System.out.println("==================");

	}

}
