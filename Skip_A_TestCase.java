package testNG;

import org.testng.annotations.Test;

//Uset to skip some Test Cases

public class Skip_A_TestCase {
	
	@Test(priority = 0)
	public void start_the_car() {
		
		System.out.println("Start the Car");
	
	}
	//change turn_On_AC() test case into enable or skip test case
	//enable default value -> true so,here we put fasle for enable value this the method going to be a enable or skip state
	
	@Test(priority = 5,enabled = false )//Skip TC
	public void turn_On_AC() {
		
		System.out.println("Turn on the A/C");
	
	}
	
	@Test (priority=3,enabled = false )//Skip TC
	public void turnOnMusic(){
		System.out.println("Rock Music On");
		
	}
	
	@Test(priority = 1)
	public void putFirstGear() {
		
		System.out.println("First Gear");
	
	}
	
	@Test(priority = 2)
	public void putSecondGear() {
		
		System.out.println("Second Gear");
	
	}
	
	@Test(priority = 3)
	public void put3rdGear() {
		
		System.out.println("Third Gear");
	
	}
	
	@Test(priority = 4)
	public void put4thGear() {
		
		System.out.println("Fouth Gear");
	
	}

}
