package March_14_2022;

	//Initializee instance variable with no argument default constructor

class Vehicle{
	int  tyre;
	String headlight;
	String Break;
	String Passangers;
	int stearing;
	int gear;
	String milage ;
	String fuel;
	
	
}

public class problem_vehicle {
	
	public static void main(String args[]) {
		Vehicle car = new Vehicle();
		Vehicle bike = new Vehicle();
		Vehicle truck = new Vehicle();
		
		System.out.println(bike.tyre);
		System.out.println(bike.stearing);
		System.out.println(bike.headlight);
		System.out.println(bike.Break);
		System.out.println(bike.gear);
		System.out.println(bike.fuel);
	}

}
//	Output is::
	//	0
	//	0
	//	null
	//	null
	//	0
	//	null