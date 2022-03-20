package March_15_2022;
// Modify the code below to add more constructors. Also modify the main method to test the new constructors.
class Person
{
	// fields
	private String name;
	private String email;
	private String phoneNumber;
	private String address;
	// constructor
	public Person(String theName,String email,String phoneNumber,String address)
	{
		this.name = theName;
		this.email =email;
		this.phoneNumber =phoneNumber;
		this.address = address;
	}
	// methods - getters
	public String getName() { return this.name;}
	public String getEmail() { return this.email;}
	public String getPhoneNumber() { return this.phoneNumber;}
	public String getAddress() { return this.address;}
	// methods - setters
	public void setName(String theName) { this.name = theName;}
	public void setEmail(String theEmail) {this.email = theEmail;}
	public void setPhoneNumber(String thePhoneNumber) { this.phoneNumber = thePhoneNumber;}
	public void setAddress(String theAddress) {this.address=theAddress ;}
	public String toString()
	{
		return this.name + " " + this.email + " " + this.phoneNumber +" "+ this.address;
	}

}

public class person_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Sana","Sana995@gmail.com","2121246325","Rajarampuri; lane N0-8; Kolhapur,");
		System.out.println(p1);
		
		System.out.println();
		Person p2 = new Person("Jean","","","Vitthalnagr- lane N0-8; Sangli,");
		p2.setEmail("jean@gmail.com");
		p2.setPhoneNumber("404 899-9955");
		System.out.println(p2);

	}

}
//output::
//	Sana Sana995@gmail.com 2121246325 Rajarampuri; lane N0-8; Kolhapur,
//
//	Jean jean@gmail.com 404 899-9955 Vitthalnagr- lane N0-8; Sangli,
