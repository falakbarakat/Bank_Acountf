package se.lexicon.Bank_Acountf;

public class Bank_Account		 {
   private	 String account_nomber;
   private double balance;
   private	 String customer_name;
   private	 String email;
   private   String phone;
   
  public  Bank_Account(String account_nomber,double balance,String customer_name,String email,String phone) {
	      this.balance=balance;
	      this .account_nomber=account_nomber;
	      this.customer_name=customer_name;
	      this.email=email;
	      this .phone=phone;
	      
  }

public String getAccount_nomber() {
	return account_nomber;
}

public void setAccount_nomber(String account_nomber) {
	this.account_nomber = account_nomber;
}

public double getBalance() {
	return balance;
}

public void setBalance(double balance) {
	this.balance = balance;
}

public String getCustomer_name() {
	return customer_name;
}

public void setCustomer_name(String customer_name) {
	this.customer_name = customer_name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}
public void falak_form() {
	System.out.println("account_nomber :"+" "+account_nomber+
			           "balance:"+ " "+ balance + 
			            "customer_name :"+" "+customer_name+
			            "email :"+ " "+email +"phone :"+" "+ phone);
	
			            
			            
			            
			           
	
}	 

}
