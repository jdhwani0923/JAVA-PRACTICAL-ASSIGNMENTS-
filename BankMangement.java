/*20. Bank Transaction History (Without Files)
 Create a Transaction class with fields type (Deposit/Withdraw), amount, and date.
 Create a BankAccount class that maintains an ArrayList<Transaction>.
 Implement deposit/withdraw methods that automatically record each transaction in history.
 Display account details and transaction history in main().*/

import java.util.*;
import java.util.ArrayList;
import java.time.LocalDateTime;

class Transaction{
	private String type;
	private double amount;
	private LocalDateTime time;
	
	Transaction(String type,double amount){
		this.type=type;
		this.amount=amount;
		this.time=LocalDateTime.now();
	}
	void display(){
		System.out.println("	type"+type+ "	amount"+amount+ "	time	"+time);
	}
}
class BankAccount {
	private String name;
	private int accno;
	private double balance;
	ArrayList<Transaction> list=new ArrayList<>();
	
	BankAccount(String name,int accno, double balance){
		this.name=name;
		this.accno=accno;
		this.balance=balance;
	}
	void display(){
		System.out.println("	name"+name+ "	accno"+accno+ "	balance	"+balance);
	}
	void list_display(){
		if (list.isEmpty()) {System.out.println("list is empty");}
		
		for(int i=0; i<list.size();i++){
			list.get(i).display();
		}
	}
	void deposit(double amount){
		balance=balance+amount;
		list.add(new Transaction("deposit",amount));
		System.out.println("deposit successfully");
	}
	void withdraw(double amount){
		balance=balance-amount;
		list.add(new Transaction("withdraw",amount));
		System.out.println("withdraw successfully");
	}
	
}
class BankMangement{
	public static void main(String [] args){
		BankAccount dhruv = new BankAccount("dhruv",68,100000);
		dhruv.list_display();
		dhruv.deposit(500);
		dhruv.withdraw(600);
		dhruv.list_display();
	}
}
	
	