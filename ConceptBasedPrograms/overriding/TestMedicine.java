/**
 * 1.	Create a class Medicine to represent a drug manufactured by a pharmaceutical company. Provide a function displayLabel() in this class to print Name and address of the company. 
Derive Tablet, Syrup and Ointment classes from the Medicine class. Override the displayLabel() function in each of these classes to print additional information suitable to the type of medicine. For example, in case of tablets, it could be “store in a cool dry place”, in case of ointments it could be “for external use only” etc.
Create a class TestMedicine . Write main function to do the following:
Declare an array of Medicine references of size 10
Create a medicine object of the type as decided by a randomly generated integer in the range 1 to 3. 
Refer Java API Documentation to find out random generation feature. 
Check the polymorphic behavior of the displayLabel() method.
 */


import java.util.Random;

class Medicine {
	String name="Medicine Company";
	String address= "India";
	
	String displayLabel(){
		
		return "Name: "+name+" Address: "+address;
	}
}

class Tablet extends Medicine{
	String type = "Tablet";
	String info = "store in a cool dry place";
	
	
	@Override
	String displayLabel() {
		return "Name: "+name+"\nAddress: "+address+" \nType and Info: "+type+" "+info;
	}

}
class Syrup extends Medicine{
	String type = "Syrup";
	String info = "Keep away from direct sunlight";
	
	
	@Override
	String displayLabel() {
		return "Name: "+name+"\nAddress: "+address+" \nType and Info: "+type+" "+info;
	}
}
class Ointment extends Medicine{
	String type = "Ointment";
	String info = "for external use only";
	
	
	@Override
	String displayLabel() {
		return "Name: "+name+"\nAddress: "+address+" \nType and Info: "+type+" "+info;
	}
}
public class TestMedicine {

	public static void main(String[] args) 
	{
		Medicine med[] = new Medicine[10];
		Random ran = new Random();
		int num = ran.nextInt() % 4;
		for(int i=0;i<10;i++)
		{
			num = ran.nextInt(4);
			if(num == 1)
				med[i] = new Ointment();
			else if(num == 2)
				med[i]= new Syrup();
			else
				med[i] = new Tablet();			
			
			System.out.println(med[i].displayLabel());
			System.out.println();	
		}		

	}


}


	



