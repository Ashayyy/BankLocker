package Testers;
import Codes.Bank;
import java.util.*;
public class BankLockerTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice,index=0;
		Bank accounts[] = new Bank[50]; 
	    System.out.println("\n1.Add Account \n2.Show Account \n3.Edit Details \n4.Remove Account \n5.Apply for Locker \n6.EXIT");
	    do
	    {
	    	System.out.print("\nEnter the choice "); 
	    	choice = sc.nextInt();
	    	
	    	switch(choice)
	    	{
	    	case 1:{
	    		System.out.print ("\nEnter BankID , Name and Bank Balance");
	    		    accounts[index++] = new Bank(sc.nextInt(),sc.next(),sc.nextDouble());
	    	} break;
	    	case 2:{
	    		    for(Bank b: accounts)
	    		    {
	    		    	if(b!=null)
	    		    		System.out.println(b);
	    		    }
	    	} break;
	    	case 3:{
	    		boolean status = false;
	    		  System.out.print("\nEnter BankID ");
	    		  int n = sc.nextInt();
	    		  System.out.print("\n1.change name \n2.Change locker duration \n3.Both");
	    		  int opt = sc.nextInt();
	    		 for(int i=0;i<accounts.length;i++) {
	    			 if(accounts[i].getBankid() == n)
	    			 {
	    				 status = true;
	    				 if(opt == 3)
	    				 {
	    					 System.out.print("\nEnter New Name and Duration ");
	    					accounts[i].setName(sc.next());
	    					accounts[i].assign(sc.nextInt());
	 	    				
	    				 }
	    				 else if(opt == 1)
	    				 {
	    					 System.out.print("\nEnter New Name ");
		    					accounts[i].setName(sc.next());
	    				 }
	    				 else if(opt == 2)
	    				 {
	    					 System.out.print("\nEnter New Duration ");
		 	    				accounts[i].assign(sc.nextInt());
	    				 }
	    				 else
	    				 {
	    					 System.out.print("\nInvalid Option...!!");
	    				 }
	    				 break;
	    			 }
	    		 }
	    		 if(status == true)
	    		 {
	    			 System.out.print("\nAccount Credentials Updated Successfully..!!");
	    		 }
	    		 else
	    		 {
	    			 System.out.print("\nAccount does not exists");
	    		 }
	    		 
	    	} break;
	    	case 4:{
	    		System.out.print ("Enter Bank Account ID"); 
	    		int bkid = sc.nextInt();
	    		boolean status = false;
	    		for(Bank b : accounts)
	    		{
	    			if(b.getBankid() == bkid)
	    			{
	    				status = true;
	    				b=null;
	    				System.out.print("\nAccount Removed Successfully.");
	    				break;
	    			}
	    		}
	    		
	    		if(status == false)
	    		System.out.print("\nAccount does not exists");
	    		
	    	} break;
	    	case 5:{
	    		 System.out.print("\nEnter the BankID "); int bkid = sc.nextInt();
	    		 boolean status = false;
	    		 for(Bank i : accounts) {
	    			 if( i.getBankid() == bkid)
	    			 {
	    				 status = true;
	    				 System.out.print("\nEnter duration ");
	    				 i.assign(sc.nextInt());
	    				 System.out.println("Locker Assigned Successfully..!!");
	    				 break;
	    			 }
	    		 }
	    	} break;
	    	case 6:break;
	    	default : System.out.print("\nInvalid Input"); break;
	    	}
	    }
	    while(choice!=6);
	}

}
