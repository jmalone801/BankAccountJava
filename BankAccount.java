

public class BankAccount {
	private double checkingBalance;
	private double savingsBalance;
	private static int accountsCreated;
	private static double total;
	public BankAccount() {
		accountsCreated++;
	}
	
	
	public double getCheckingBalance() {
		return checkingBalance;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

	public static double getTotal() {
		return total;
	}


	public void deposit() {
		System.out.println("Please enter account type:");
		String accountType = System.console().readLine();
		System.out.println("Please enter deposit amount:");
		String depositAmount = System.console().readLine();
		int depositTotal = Integer.parseInt(depositAmount);
		if(accountType.contains("checkings")) {
			checkingBalance += depositTotal;
			total += depositTotal;
			System.out.println("Deposit successful! Checkings total is now: $" + depositTotal );
		}
		else if(accountType.contains("savings")) {
			savingsBalance += depositTotal;
			total += depositTotal;
			System.out.println("Deposit successful! Savings total is now: $" + depositTotal );
		}
	}
	
	public void withdrawal() {
		System.out.println("Please enter account type:");
		String accountType = System.console().readLine();
		System.out.println("Please enter withdrawal amount:");
		String withdrawalAmount = System.console().readLine();
		int withdrawalTotal = Integer.parseInt(withdrawalAmount);
		if(accountType.contains("checkings")) {
			checkingBalance -= withdrawalTotal;
			total -= withdrawalTotal;
			System.out.println("Withdrawal successful! Checkings total is now: $" + withdrawalTotal );
		}
		else if(accountType.contains("savings")) {
			savingsBalance -= withdrawalTotal;
			total -= withdrawalTotal;
			System.out.println("Withdrawal successful! Savings total is now: $" + withdrawalTotal );
		}
	}
	
	
	
}
