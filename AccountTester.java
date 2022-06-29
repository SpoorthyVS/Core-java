class AccountTester{

	public static void main(String a[]){
	
		SavingsAccount sa = new SavingsAccount(4.00);
		sa.deposit(500.00);
		sa.withDraw(500.00);
		sa.periodicInterest();
	
	
		SavingsAccount other = new SavingsAccount(0.3);
		sa.transfer(3000.00, other);
		double totalAmount = other.getBalance();
		System.out.println("Balance of Other Account : "+totalAmount);
		System.out.println("-----------");
		
		
		
		CurrentAccount ca = new CurrentAccount(0.3);
		ca.deposit(300.00);
		ca.withDraw(600.00);
		ca.periodicInterest();
		ca.getBalance();
	}









}