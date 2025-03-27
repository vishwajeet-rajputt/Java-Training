
public class intsa {
	String uid;
	int password;
	String bio;

	intsa(String uid, int password) {
		this.uid = uid;
		this.password = password;
	}

	intsa(String uid, int password, String bio) {
		this(uid, password);
		this.bio = bio;
	}

}
