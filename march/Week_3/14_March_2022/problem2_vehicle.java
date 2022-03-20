package March_14_2022;

class Vehicle1 {
	int tyre;
	String headlight;
	String Break;
	String Passangers;
	int stearing;
	int gear;
	String milage;
	String fuel;

	Vehicle1() {
		this.Break = "Yes";
		this.headlight = "present";
		this.stearing = 1;
		this.Passangers = "Carry";

	}
	Vehicle1(int tyre, String fuel,int gear,String milage){
		this.tyre =tyre;
		this.fuel =fuel;
		this.gear = gear;
		this.milage = milage;
	}

	public int getTyre() {
		return tyre;
	}

	public void setTyre(int tyre) {
		this.tyre = tyre;
	}

	public String getHeadlight() {
		return headlight;
	}

	public void setHeadlight(String headlight) {
		this.headlight = headlight;
	}

	public String getBreak() {
		return Break;
	}

	public void setBreak(String break1) {
		Break = break1;
	}

	public String getPassangers() {
		return Passangers;
	}

	public void setPassangers(String passangers) {
		Passangers = passangers;
	}

	public int getStearing() {
		return stearing;
	}

	public void setStearing(int stearing) {
		this.stearing = stearing;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public String getMilage() {
		return milage;
	}

	public void setMilage(String milage) {
		this.milage = milage;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	@Override
	public String toString() {
		return "Vehicle1 [tyre=" + tyre + ", headlight=" + headlight + ", Break=" + Break + ", Passangers=" + Passangers
				+ ", stearing=" + stearing + ", gear=" + gear + ", milage=" + milage + ", fuel=" + fuel + "]";
	}
	

}

public class problem2_vehicle {

	public static void main(String[] args) {
		Vehicle1 bike = new Vehicle1();
		
		Vehicle1 car = new Vehicle1(4,"petrol",5,"20");
	
		Vehicle1 truck = new Vehicle1(8,"Disel",8,"10");
		
		System.out.println("car : "+car);
		System.out.println("truck : "+truck);
		System.out.println("bike : "+bike);
	}

}
//
