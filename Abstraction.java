abstract class Abstration {
	int noofTyres;
	abstract void start();

}
class Car extends Abstration
{

	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("Starts with Key");
	}
	
}

class Scotter extends  Abstration
{

	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("Starts with Kick");
	}
	
	public static void main(String[] args)
	{
		Scotter obj1 = new Scotter();
		Car obj2 = new Car();
		obj1.start();
		obj2.start();
		
	}
	
}
