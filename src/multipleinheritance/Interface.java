package multipleinheritance;
interface VehicleColour{
	void colour();
}
interface VehicleModel{
	void model();
}
class Vehicle implements VehicleColour,VehicleModel{
	public void colour()
	{
		System.out.println("Vehicle Colour is Black.");
	}
	public void model() {
		System.out.println("Model is Mercedes.");
	}
}
//Creating  a static class and intiating the object
public class Interface {

	public static void main(String[] args) {
		Vehicle a = new Vehicle();
		a.colour();
		a.model();

	}

}
