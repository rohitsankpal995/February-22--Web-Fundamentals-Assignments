package March_15_2022;

class Employee{
	String id;
	String name;
	String department;
	String workLocation;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}

	public String getWorkLocation() {
		return workLocation;
	}
	
	public void setWorkLocation(String workLocation) {
		this.workLocation = workLocation;
	}

	@Override
	public String toString() {
		return "Employee id=" + id + ", name=" + name + ", department=" + department + ", workLocation=" + workLocation;
	}
	
	
}

public class emp_details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		e1.setId("1111");
		e1.setName("John");
		e1.setDepartment("Finanace");
		e1.setWorkLocation("Banglore");
		System.out.println(e1);
		
		System.out.println();
		Employee e2 = new Employee();
		e2.setId("2222");
		e2.setName("Steve");
		e2.setDepartment("Human Resource");
		e2.setWorkLocation("Banglore");
		System.out.println(e2);

	}

}
//Output::
//	Employee id=1111, name=John, department=Finanace, workLocation=Banglore
//
//	Employee id=2222, name=Steve, department=Human Resource, workLocation=null