package students;

public class bankaccount {
	
	int availablebalance,accountnumber;
	String accountholdername,bankname;
	String branchX;
	
	bankaccount(int availablebalance,int accountnumber,String accountholdername,String bankname)
	{
		this.availablebalance=availablebalance;
		this.accountnumber=accountnumber;
		this.accountholdername=	accountholdername;
	    this.bankname=bankname;
	}
	
	void deposit(int depo) 
	{
		int newbalance;
		newbalance=availablebalance+depo;
		availablebalance=newbalance;
	}
	
	void withdraw(int amount)
	{
	int finalbalance;
	finalbalance=availablebalance-amount;
	availablebalance=finalbalance;
	}
	void display() 
	{
	System.out.println("bank name: "+bankname);
	System.out.println("account holders name: "+accountholdername);
	System.out.println("account holders number: "+accountnumber);
	System.out.println("available balance: "+availablebalance);
	
	}
	
	
	public static void main(String[] args)
	{
		bankaccount aliston=new bankaccount(500000,12345,"aliston","state bank of india");
				aliston.deposit(5000);
				aliston.display();
	}

}
