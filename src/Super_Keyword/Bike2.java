package Super_Keyword;

class vehicle2
{
	vehicle2()
	{
		System.out.println("i am from parent vehicle2 class");
	}
}

public class Bike2 extends vehicle2{

	Bike2()
	{ super();
		System.out.println("i am from child Bike2 class");
	}
	public static void main(String[] args) {
		
		Bike2 b2=new Bike2();
		
	}

}
