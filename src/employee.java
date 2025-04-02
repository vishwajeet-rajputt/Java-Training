
public class employee {
	private int uId;
	private String name;
	private String email;
	private int salary;
	private String designation;
	
	 private employee(int uId,String name,String email, int salary, String designation){
		this.uId=uId;
		this.name=name;
		this.email=email;
		this.salary=salary;
		this.designation=designation;
	}
	 
	 void setName(String name) {
		 this.name=name;
	 }
	 void setEmail(String email) {
		 this.email=email;
	 }
	 void setSalary(int salary) {
		 this.salary=salary;
	 }
	 void setDesignation(String designation) {
		 this.designation=designation;
	 }
	 
	 int getUId() {
		 return uId;
	 }
	 String getName() {
		 return name;
	 }
	 String getEmail() {
		 return email;
	 }
	 int getSalary() {
		 return salary;
	 }
	 String getDesignation() {
		 return designation;
	 }
	 
	 public static employee getEmployeeObject(int uId, String name, String email, int salary, String designation) {
		 return new employee(uId,name,email,salary,designation);
	 }
}
