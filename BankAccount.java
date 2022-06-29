class BankAccount{

    double amount;
   
   //METHOD TO GET totalAmount
   public  void main(String[] args){
   System.out.println("main method started");
   deposit(6700.00);
   getTotalAmount(0);
   withDraw(550.00);
   getTotalAmount(0);
   System.out.println("end of main method");
   }
  
   
     void deposit(double amt){
   System.out.println("invoke deposit()");
   System.out.println("amount to be deposit" +amt);
   System.out.println("balance/amount before deposit" +amount);
    amount=amount+amt;
   System.out.println("amount after deposit"+amount);
   System.out.println("end of deposit()");
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
   }
   
   
   
   
   
     void getTotalAmount(double amt){
	   System.out.println("Total amount available in account is:" +amount);
   }
    double getBalance(){
   return amount;
   }
   //public is an access modifier it is not neccessary only return type is required.
    void transfer (double amount, BankAccount other ){
	   withDraw(amount);
	   other.deposit(amount);
	   
   }
}