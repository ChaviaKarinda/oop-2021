package interfaces; 
import java.util.*; 
public class ProtectedBankAccount implements BankAccount { 

	private float lowerBound; 

	private Person owner; 
	private String number;
	private float balance;
	private List<Operation> theOperations;


	public ProtectedBankAccount(Person owner, String number, float lowerBound){ 
		this.owner = owner; 
		this.number = number; 
		this.balance = 0; 
		this.theOperations = new ArrayList(); 
		this.lowerBound = lowerBound; 
	} 
public Person getOwner() {
	 return this.owner; 
}
public String getNumber() { 
	return this.number; 
} 
public float getBalance() { 
	return this.balance; 
} 

public void credit(float amount) { 
	this.balance = this.balance + amount; 
	Date date = Calendar.getInstance().getTime(); 
	this.theOperations.add(new Operation(amount,date)); 
} 
public void withdraw(float amount) { 
	if (this.balance-amount >= this.lowerBound) { 
		this.balance = this.balance + amount; 
		Date date = Calendar.getInstance().getTime(); 
		this.theOperations.add(new Operation(amount,date)); 
} 
// else nothing... or an exception to be thrown 
} 

public List getOperationsAfter(Date time) { 
	List <Operattion> result = new ArrayList(); 
	for(Operation op : this.theOperations) { 
		if (op.getDate().compareTo(time) >= 0) { 
		result.add(op);
		} 
	} 
	return result;
}

public float getLowerBound() {
	return this.lowerBound;
	}
}