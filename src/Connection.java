
public class Connection {
	private static Connection connection;
	private String dbName;
	private String userName;

	private Connection(String dbName, String userName) {
		this.dbName = dbName;
		this.userName = userName;
	}

	public String getdbName() {
		return this.dbName;
	}

	public String getuserName() {
		return this.userName;
	}

	public static Connection getConnection(String dbName, String userName) {
		if (connection == null) {
			connection = new Connection(dbName, userName);
		}
		return connection;
	}
}
