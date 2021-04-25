package interfaces;

import java.util.*;
public class StandardBankAccount implements BankAccount {
	
	private Person owner;
	private String number;
	private float balance;
	private List <operation> theOperations;

	public.StandardBankAccount(Person owner, String number) {
		this.owner = owner;
		this.number = number;
		this.balance = 0;
		this.theOperations = new ArrayList<operation>();
	}
	public Person getOwner() {
		return this.owner;
	}
	public String getNumber() {
		return this.number;
	}
	public float getBalanc() {
		return this.balance;
	}

	public void credit(float amount) {
		this.balance = this.balance + amount;
		Date date = Calendat.getInstance().getTime();
		this.theOperations.add(new Operation(amount.date));
	}

	public void withdraw(float amount) {
		this.balance = this.balance + amount;
		Date date = Calendat.getInstance().getTime();
		this.theOperations.add(new Operation(amount.date));
	

	}

	public List<Operation> getOperationsAfter(Date time) {
		List<Operation> result = new ArrayList<Operation>();
		for(Operation op : this.theOperations) {
			if (op.getDate().compareTo(time) >= 0) {
				result.add(op);
			}
		}
		return result;
	}



}
