package test1c;

public class Staff {
	
	private String position;
	private String startDate;
	private int hours;
	private double ratePerHour;
	private double salary;
	private boolean paid;
	
	//null constructor
	public Staff(){
	}
	
	public Staff(String position, String startDate, int hours, double ratePerHour, double salary, boolean paid){
		this.position = position;
		this.startDate = startDate;
		this.hours = hours;
		this.ratePerHour = ratePerHour;
		this.salary = salary;
		this.paid = paid;
	}
	
	//getMethods
	public String getPosition(){
		return position;
	}
	
	public String getStartDate(){
		return startDate;
	}
	
	public int getHours(){
		return hours;
	}
	
	public double getRatePerHour(){
		return ratePerHour;
	}
	
	public boolean getPaid(){
		return paid;
	}
	
	public double getSalary(){
		return salary;
	}
	
	//SetMethods
	public void setHours(int hours){
		this.hours = hours;
	}
	
	public void setPosition(String position){
		this.position = position;
	}
	
	public void setStartDate(String startDate){
		this.startDate = startDate;
	}
	
	public void setRatePerHour(double ratePerHour){
		this.ratePerHour = ratePerHour;
	}
	
	public void setSalary(){
		this.salary = hours * ratePerHour;
	}
	
	public void setPaid(boolean paid){
		this.paid = paid;
	}
	
	//toString
	public String toString(){
		return "Position: " + position +
			"\nStart Date: " + startDate +
			"\nHours: " + hours +
			"\nRate per hour: " + ratePerHour +
			"\nSalary: " + salary +
			"\nPaid status: " + paid + 
			"\n----------";
	}
	
}
