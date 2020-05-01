package Task2;

import java.util.HashSet;

public class Bank {
	public static void main(String [] args) {
		HashSet<Account> accounts=new HashSet<Account>();
		Account acc1=new Account(20);
		Account acc2=new Account(20);
		Account savAcc1=new SavingsAccount(21);
		Account checAcc1=new CheckingAccount(23);
		accounts.add(acc1);
		accounts.add(acc2);
		accounts.add(savAcc1);
		accounts.add(checAcc1);
		System.out.println(accounts);
		System.out.println();
		for(Account a:accounts){
			a.deposit(30);
		}
		for(Account a:accounts){
			update(a);
		}
		System.out.println(accounts);
		for(Account a:accounts){
			a.deposit(30);
		}
		accounts.remove(closeAccount(20));
		accounts.add(openAccount(25));
		for(Account a:accounts){
			update(a);
		}
		for(Account account:accounts)
			account.print();
	}
	
	public static void update(Account a) {
		if (a instanceof SavingsAccount)((SavingsAccount) a).addInterestRate(); else
		if (a instanceof CheckingAccount) {
			((CheckingAccount) a).deductFee();
		}
	}
	public static Account openAccount(int n) {
		Account acc = new Account(n);
		return acc;
	}
	public static Account closeAccount(int n) {
		Account acc = new Account(n);
		return acc;
	}

}
