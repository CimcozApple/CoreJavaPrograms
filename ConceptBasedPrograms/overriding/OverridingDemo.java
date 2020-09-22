class SuClassDemo{
	
	Object getNumber()
	{
		System.out.println("invocking get number method of superclass");
		return null;
	}
	
	
}

class Subclass extends SuClassDemo{
	@Override
	public String getNumber()
	{
		///test of is-a rel with Number and Integer
		// Integer is a Number? if yes allowed : if no not allowed
		//Covarient -->is-a test
		System.out.println("Invock getnumber subclass");
		return null;
	}
	
}
public class OverridingDemo {

	public static void main(String[] args) {

		
	}

}
