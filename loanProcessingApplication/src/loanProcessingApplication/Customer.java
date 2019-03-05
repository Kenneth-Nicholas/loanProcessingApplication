package loanProcessingApplication;

public class Customer {
	
	private String customerID;
	private String firstName;
	private String lastName;
	private int age;
	private String emailAddress;
	private double salary;
	private double amount;
	private double interestRate;
	private int loanPeriod;
	
	public Customer() {
		
		super();
		
	}

	public Customer(String customerID, String firstName, String lastName, int age, String emailAddress, double salary, double amount, double interestRate, int loanPeriod) {
		
		super();
		
		this.customerID = customerID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.emailAddress = emailAddress;
		this.salary = salary;
		this.amount = amount;
		this.interestRate = interestRate;
		this.loanPeriod = loanPeriod;
		
	}
	
	public void generateCustomerID() {
		
		double digitPortion = (Math.random() * ((99 - 10) + 1) + 10);
		
		int intDigitPortion = (int) (digitPortion);
		
		char charPortion = this.firstName.charAt(0);
		
		this.customerID = charPortion + Integer.toString(intDigitPortion);
		
	}

	public String getCustomerID() {
		
		return customerID;
		
	}

	public String getFirstName() {
		
		return firstName;
		
	}

	public void setFirstName(String firstName) {
		
		this.firstName = firstName;
		
	}

	public String getLastName() {
		
		return lastName;
		
	}

	public void setLastName(String lastName) {
		
		this.lastName = lastName;
		
	}

	public int getAge() {
		
		return age;
		
	}

	public void setAge(int age) {
		
		this.age = age;
		
	}

	public String getEmailAddress() {
		
		return emailAddress;
		
	}

	public void setEmailAddress(String emailAddress) {
		
		this.emailAddress = emailAddress;
		
	}

	public double getSalary() {
		
		return salary;
		
	}

	public void setSalary(double salary) {
		
		this.salary = salary;
		
	}

	public double getAmount() {
		
		return amount;
		
	}

	public void setAmount(double amount) {
		
		this.amount = amount;
		
	}

	public double getInterestRate() {
		
		return interestRate;
		
	}

	public void setInterestRate(double interestRate) {
		
		this.interestRate = interestRate;
		
	}

	public int getLoanPeriod() {
		
		return loanPeriod;
		
	}

	public void setLoanPeriod(int loanPeriod) {
		
		this.loanPeriod = loanPeriod;
		
	}
	
}
