
public class makeConnection {

	public static void main(String[] args) {
		Connection c1 = Connection.getConnection("MongoDb", "123");
		System.out.println(c1);
		Connection c2 = Connection.getConnection("sql", "12345");
		System.out.println(c2);
		Connection c3 = Connection.getConnection("postgresql", "124");
		System.out.println(c3.getuserName());
	}

}
