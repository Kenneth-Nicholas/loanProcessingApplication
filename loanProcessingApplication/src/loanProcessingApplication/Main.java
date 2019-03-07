package loanProcessingApplication;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the loan processing application!");
		
		System.out.println("This application allows you to apply for a loan of the amount, interest rate, and number of payments you specify.");
		
		System.out.println("It determines if you are eligible to take out the loan and then prints the result of your application to the console.");
		
		Scanner sc = new Scanner(System.in);
		
		Customer customer = new Customer();
		
		System.out.print("Enter your first name: ");
		
		customer.setFirstName(sc.nextLine());
		
		System.out.print("Enter your last name: ");
		
		customer.setLastName(sc.nextLine());
		
		System.out.print("Enter your age: ");

		customer.setAge(sc.nextInt());
		
		sc.nextLine();
		
		System.out.print("Enter your email address: ");
		
		customer.setEmailAddress(sc.nextLine());
		
		System.out.print("Enter your salary: ");
		
		customer.setSalary(sc.nextDouble());
		
		System.out.print("Enter the amount of the loan that you would like to apply for: ");
		
		customer.setAmount(sc.nextDouble());
		
		System.out.print("Enter the interest rate of the loan that your are applying for: ");
		
		customer.setInterestRate(sc.nextDouble());
		
		System.out.print("Enter the number of months the loan will be for: ");
		
		customer.setLoanPeriod(sc.nextInt());
		
		System.out.println();
		
		customer.generateCustomerID();
		
		DecimalFormat df = new DecimalFormat("$###,###.00");
		
		if(loanApplicationResult(customer.getAge(), customer.getSalary(), customer.getAmount(), customer.getInterestRate(), customer.getLoanPeriod())) {
			
			System.out.println(customer.getFirstName() + " " + customer.getLastName());
			System.out.println("Your customer ID is: " + customer.getCustomerID());
			System.out.println("The loan you have been approved for is for the amount of " + df.format(customer.getAmount()));
			LocalDateTime dateAndTimeNow = LocalDateTime.now();
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
			System.out.println("Your loan application was processed and approved on " + dtf.format(dateAndTimeNow));

		}
		
	}
	
	public static boolean loanApplicationResult(int age, double salary, double amount, double interestRate, int loanPeriod) {
		
		boolean result = false;
		
		if(amount > (salary * 3)) {
			
			System.out.println("Loan Denied\nYour loan request has been denied because the amount of the loan requested is more than 3 times your salary.");
			result = false;
			
		} 
		
		if (amount > 60000.00d) {
			
			System.out.println("Loan Denied\nYour loan request has been denied because the amount of the loan requested is greater than $60,000.00");
			result = false;
			
		} 
		
		if (age < 18) {
			
			System.out.println("Loan Denied\nYour loan request has been denied because you are younger than 18 years of age.");
			result = false;
			
		} 
		
		if ((age > 18) && (amount <= 60000.00d) && (amount <= (salary * 3))) {
			
			System.out.println("Congratulations, your loan is approved!");
			result = true;
		
		}
		
		return result;
		
	}

}
