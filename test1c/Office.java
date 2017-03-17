package test1c;

public class Office {

	public static void main(String[] args) {
		
		//using null constructor
		Staff s1 = new Staff();
		
		//setMethods
		s1.setPosition("Manager");
		s1.setStartDate("28-09-2016");
		s1.setRatePerHour(22.50);
		s1.setHours(65);
		s1.setSalary();
		s1.setPaid(true);

		//toString
		System.out.println(s1);
	    
		//getMethods
		System.out.println(
			"Position: " + s1.getPosition() +
			"\nStart date: " + s1.getStartDate() +
			"\nHours: " + s1.getHours() +
			"\nRate per hour: " + s1.getRatePerHour() +
			"\nSalary: " + s1.getSalary() +
			"\nPaid status: " + s1.getPaid() +
			"\n----------");
			
		//second constructor, with three undefined.
		Staff s2 = new Staff("Janitor", "31-12-2017", 0, 0, 0, true);
	    
		//setMethods
		s2.setHours(50);
		s2.setRatePerHour(25.0);
		s2.setSalary();
		s2.setPaid(false);
	    
		//toString
		System.out.println(s2);
	    
		//getMethods
		System.out.println(
			"Position: " + s2.getPosition() +
			"\nStart date: " + s2.getStartDate() +
			"\nHours: " + s2.getHours() +
			"\nRate per hour: " + s2.getRatePerHour() +
			"\nSalary: " + s2.getSalary() +
			"\nPaid status: " + s2.getPaid() +
			"\n----------");
	    
	}

}
