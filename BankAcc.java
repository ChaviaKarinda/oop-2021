package interfaces;

import java.util.*; 

public class *****BankAccount implements BankAccount { ************************* 

	private Person owner; 
	private  String number;
	private  float balance;
	private  List theOperations;



	public *****BankAccount(Person owner, String number *****) { 
		this.owner = owner; 
		this.number = number; 
		this.balance = 0; 
		this.theOperations = new ArrayList(); 

	}
	public Person getOwner() { 
		return this.owner; 
	} 
	public String getNumber() { 
		return this.number; 
	} public float getBalance() { 
		return this.balance; 
	} 


	public void credit(float amount) { 
	************************* 
	************************* 
	************************* } 
	public void withdraw(float amount) { 
	************************* 
	************************* 
	************************* 
	************************* 
	************************* 

	} 
	public List getOperationsAfter(Date time) { 
		List <Operation>result = new ArrayList(); 
		for(Operation op : this.theOperations) { 
			if (op.getDate().compareTo(time) >= 0) { 
				result.add(op); 
			} 
		} 
		return result;
	}

	 *************************
	 ************************* 
	 ************************* }
