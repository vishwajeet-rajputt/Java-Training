
public class objLoading {
	{
		System.out.println("Non-static block 1");
	}
	int a = m1();

	objLoading() {
		System.out.println("Constructor");
	}

	{
		System.out.println("Non-static block 2");
		System.out.println(a);
	}

	public int m1() {
		System.out.println("non-static method");
		return 100;
	}
}
