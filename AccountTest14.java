package domashnoit;

public class AccountTest14 {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Account acc1 = new Account(1122, 20000);
			acc1.withdraw(2500);
			acc1.deposit(3000);
			System.out.println("balance: "+acc1.getBalance()+", monthly interest rate: "+Account.getMonthlyInterestRate()+", date created: "+acc1.getDateCreated());
		}

	}

