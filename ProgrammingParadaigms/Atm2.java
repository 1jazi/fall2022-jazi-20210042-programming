package ProgrammingParadaigms;
public class Atm2 extends Atm {
 // here i make override by give method bank different job
	@Override
	public void bank() {
		// make loop to print menu and id you enter 3 the program will close
		while (choice != 3) {
             
			System.out.println("\nplease enter your choice: \n");
			System.out.println("1- Current Balance");
			System.out.println("2-Cash WithdrawL");
			System.out.println("3-End transaction");
			choice = scanner.nextInt();
			if (choice == 1) {
				Choice(); // call the method
			} else if (choice == 2) {
				System.out.print("\nEnter the amount to be withdrawn :  ");
				int WithdrawL = scanner.nextInt();
				Choice(WithdrawL); // call the method
			} else if (choice == 3) {
				System.out.println("please get your card ");
			}
		}
	}

	//overload for method choice
	public void Choice() {
		System.out.println("your current balance is : " + balance);
	}

	public void Choice(int WithdrawL) {
		if (WithdrawL <= balance) {
			System.out.println("WithdrawL will be sucsses");
			balance = balance - WithdrawL;
		} else if (WithdrawL > balance) {
			System.out.println("your balance is low");
		}
	}

}
