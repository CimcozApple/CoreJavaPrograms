class SuperClass{
	{
		System.out.println("in super class instance block");
	}
	
	public SuperClass() 
	{
		System.out.println("In superclass constructor");
	}
	SuperClass(String x)
	{
		System.out.println("in superclass param constructor");
	}
}


class SubClass extends SuperClass{
	{
		System.out.println("In subclass Instance Block");
	}
	SubClass() {
		System.out.println("In Subclass constructor");
	}
	SubClass(int x)
	{
		super("XXX");
		System.out.println("in subclass param constructor");
	}
}


public class InheritanceDemo {
	public InheritanceDemo() {
		System.out.println("In Inheritance Constructor");
	}
	public static void main(String[] args) {
		new SubClass();
	}

}
