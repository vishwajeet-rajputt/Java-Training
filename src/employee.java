
public class employee {
	int uId;
	String name;
	String email;
	int salary;
	String designation;
	
	employee(int uId, String name){
		this.uId=uId;
		this.name=name;
	}
	employee(int uId, String name,String designation){
		this(uId,name);
		this.designation=designation;
	}
	employee(int uId,String name,String email, int salary, String designation){
		this(uId,name,designation);
		this.salary=salary;
		this.email=email;
	}
	
	void display() {
		if(this.uId!=0)System.out.println("Id: "+ this.uId);
		if(this.name!=null)System.out.println("Name: "+ this.name);
		if(this.email!=null)System.out.println("E-mail: "+ this.email);
		if(this.salary!=0)System.out.println("Salary: "+ this.salary);
		if(this.designation!=null)System.out.println("Designation: "+ this.designation);
	}
}
