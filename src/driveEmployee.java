
public class driveEmployee {

	public static void main(String[] args) {
		employee e1 = employee.getEmployeeObject(1,"Ankit","ankit@gmail.com",45000,"Engineer");
		System.out.println(e1.getUId());
		System.out.println(e1.getName());
		System.out.println(e1.getEmail());
		System.out.println(e1.getSalary());
		System.out.println(e1.getDesignation());
		e1.setDesignation("NO- JOB");
		e1.setName("me");
		System.out.println(e1.getName());
		System.out.println(e1.getDesignation());

	}

}
