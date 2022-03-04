package DemoModule;
class Vehicle
{
	void run()
	{
		System.out.println("Vehicle is Running");
	}
}

public class MethodOverriding extends Vehicle {

	public static void main(String[] args) {
		MethodOverriding obj = new MethodOverriding();
		obj.run();

	}

}
