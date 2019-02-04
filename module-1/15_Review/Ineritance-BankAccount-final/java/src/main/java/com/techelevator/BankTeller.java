package com.techelevator;

public class BankTeller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	BankCustomer SamPetitti = new BankCustomer();
	
	SavingsAccount SamSavingsAccount = new SavingsAccount("Samuel Petitti", "123456", new DollarAmount(50024));
	CheckingAccount SamCheckingAccount = new CheckingAccount("Samuel Petitti", "1234567", new DollarAmount(50028));
	
	SamPetitti.addAccount(SamSavingsAccount);
	SamPetitti.addAccount(SamCheckingAccount);
	
	
	System.out.println(SamSavingsAccount.getBalance().getCents());
	System.out.println(SamCheckingAccount.getBalance());
	

	}

}
