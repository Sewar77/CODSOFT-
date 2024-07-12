package RandomNumber;
import java.util.Scanner;

public class ATM__Machine {
	Scanner read = new Scanner(System.in);
	public static void main(String[] args) {
		 BankAccount userAccount = new BankAccount(1000); // Initial balance
	     ATM atm = new ATM(userAccount);
	     atm.start(); // Starts the ATM interface
	    }
	
	
	
	public static class ATM{
		Scanner read = new Scanner(System.in);
		private BankAccount bankAccount;

        public ATM(BankAccount bankAccount) {
            this.bankAccount = bankAccount;
        }
        
		public void start() {
			System.out.println("Enter Card please.");
            System.out.println("Enter the password: ");
            int password = read.nextInt(); //please enter the password 123123
            if (password != 123123) {
                System.out.println("Invalid password. Exiting...");
                return;
            }
            
            while (password == 123123) {
            	System.out.println("\nATM Menu:\n1. Withdraw.  \n2. Deposit.   \n3. Check Balance.   \n4. Exit");
            	int userchoice = read.nextInt();
            	if (userchoice == 1) {
            		Withdraw();
            	}
            	
            	else if (userchoice == 2) {
				    deposit();
				}
				
            	else if (userchoice == 3) {
            		Check_balance();
				}
            	else if (userchoice == 4) {
					break;
				}
            	
            }
		}
            
            private void Withdraw() {
            	System.out.println("Enter the amount: " );
            	float amount = read.nextFloat();
            	if (bankAccount.withdraw(amount)) {
            		System.out.println("Successful");
            	}System.out.println("failed");
            	
            }
            private void deposit() {
            	System.out.println("Enter the amount: " );
            	float amount = read.nextFloat();
            	 bankAccount.deposit(amount);
                 System.out.println("Deposit successful.");
            }
            
            private void Check_balance() {
            	 float balance = bankAccount.getBalance();
                 System.out.println("Your balance: " + balance);
            }
            
            
		}
	
	
	public static class BankAccount {
        private float balance;

        public BankAccount(float initialBalance) {
            this.balance = initialBalance;
        }

        public boolean withdraw(float amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                return true;
            }
            return false;
        }

        public void deposit(float amount) {
            if (amount > 0) {
                balance += amount;
            }
        }

        public float getBalance() {
            return balance;
        }
    }
	
	}
	
	
	
	
	
	
	
	


