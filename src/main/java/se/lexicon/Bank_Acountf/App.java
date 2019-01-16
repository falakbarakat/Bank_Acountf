package se.lexicon.Bank_Acountf;

/**
 * Hello world!
 *
 */
import java.util.Scanner;
public class App 
{
    public static void main( String[] args ) {
          Bank_Account falak=new Bank_Account("466789",5000,"falak Barakat","falak.barakat@gmail.com","0763110925");
          boolean   running=true;
          String choice;
          double withdrawig;
          double depositing;
          System.out.println("welcome!" +" "+"1_for viewing balance");
          
          System.out.println("2_for depositing");
          System.out.println("3_forwithdrawing");
          System.out.println("input yor choice");
                                  choice=Int_Input.getInput();
       while (running) { 
    	   
         

                        switch (choice) {
                            case "1":
                        	         System.out.println("BALANCE : "+" "+ falak.getBalance()+ 
                        	        		 " / "+ "account_nomber:"+" "+falak.getAccount_nomber()+
                        	        		 " / "+ "customer_name:"+" " +falak.getCustomer_name());
                        	         System.out.println("welcome back");
                        	  
                        	         break;
                            case "2":
                            	    
                            	   Scanner sc2=new Scanner(System.in);
                            	   System.out.println("input depositing ");
                            	
                        	        System.out.println("The new balance :" +(falak.getBalance()+sc2.nextDouble()));
                        	      
                        	       System.out.println("thanks,goodby");
                        	       running=false;
                        	        break;
                            case "3":
                           
                            	    System.out.println("input withdrawing ");
                            	    int sc3=Int_Input.valid_number();
                            	    if ((falak.getBalance()-sc3)>=0 ){
                            	    	System.out.println("new balance:"+" "+
                            	    			(falak.getBalance()-sc3)+""+
                            	    			"thanks");
                            	    	running=false;
                            	    	break;
                            	    }
                            	    else {
                            	    	System.out.println("credit is not sufficient,you can not draw money" );
                            	    running=false;
                            	    }   
                            	    
                            default :
                        	        running=false;
                        	        break;
                        
                              }
              }              
 
}
}