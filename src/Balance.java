
public class Balance {

	public static void main(String[] args) {
		int userNo=52;
		int balance=0;
		if(userNo<100) {
			
			balance+=100;
			System.out.println("Rohit current Balance: "+balance);
		}
		balance-=25;
		System.out.println("Rohit current balance: "+ balance);
		balance+=2;
		System.out.println("Rohit current balance "+balance);
		balance-=20;
		System.out.println("Rohit current balance: "+ balance);
		balance+=2;
		System.out.println("Rohit current balance "+balance);
		balance+=50;
		System.out.println("Rohit current balance: "+ balance);
		balance+=2;
		System.out.println("Rohit current balance "+balance);

	}

}
