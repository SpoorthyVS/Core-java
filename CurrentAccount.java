class CurrentAccount extends BankAccount {
	
	int transactionCount;
	int freeTransactions = 10;
	double interestRate;
	double inte;
	
	
	public CurrentAccount(double interestRate){
		this.interestRate = interestRate;
		this.inte = inte;
	}




	void deposit(double amt){
   System.out.println("invoke deposit()");
   System.out.println("amount to be deposit" +amt);
   System.out.println("balance/amount before deposit" +amount);
    amount=amount+amt;
   System.out.println("amount after deposit"+amount);
   System.out.println("end of deposit()");
   transactionCount++;
   }
   
   
   
   void withDraw(double amt){
   System.out.println("invoke withDraw()");
   System.out.println("amount to be withDrawn" +amt);
   System.out.println("amount before withDraw" +amount);
    amount= amount-amt;
	if(amount<=0){
		System.out.println("insufficient balance");
	}
	else{
		System.out.println(amount);
	}
   System.out.println("amount after withDraw" +amount);
   System.out.println("end of withDraw()");
   transactionCount++;
   }
   
   public double getBalance(){
	    System.out.println(" Total amount available is");
	   return amount;
   }
   public void deductionFee(){
	   double transactionInte = 0;
	   
	   System.out.println("deductionFee started");
	    System.out.println("the total number of transactions count "+ transactionCount);
		if(transactionCount > freeTransactions){
			transactionInte = inte * (transactionCount - freeTransactions);
			
			withDraw(transactionInte);	
		}
		else{
			
			getBalance();
		}
	   System.out.println("deductionFee ended");
   }
   
   
   public double periodicInterest(){
		double interest = getBalance() * interestRate/100;
		deposit (interest);
		return interest ;
   }
   
   
   
   
   
   
   

}