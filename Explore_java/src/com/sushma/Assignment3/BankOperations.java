package com.sushma.Assignment3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class BankOperations {
	String Name, Contact_number, Mail_id;
	String Company_Name, Type_of_Business;

	public CurrentAccountClass CurrentAccount(Scanner inputscan,
			HashMap<Long, CurrentAccountClass> currentAccountList) {
		System.out.println("Enter Account holder name :");
		Name = inputscan.nextLine();
		System.out.println("Enter Contact Number :");
		Contact_number = inputscan.nextLine();
		System.out.println("Enter Mail id :");
		Mail_id = inputscan.nextLine();
		System.out.println("Enter Company Name");
		Company_Name = inputscan.nextLine();
		System.out.println("Enter type of business");
		Type_of_Business = inputscan.nextLine();
		CurrentAccountClass a = null;
		System.out.println("Terms and conditions \n (A)ccept (D)ecline");

		switch (inputscan.next()) {
		case "A":
			boolean k = false;
			for (Entry<Long, CurrentAccountClass> entry : currentAccountList.entrySet()) {
				if (entry.getValue().getCompany_Name().equals(Company_Name)
						&& entry.getValue().getMail_id().equals(Mail_id))
					;
				{
					System.out.println("representaive registed for this account......");
					k = true;
					break;
				}
			}
			if (k == false) {
				a = new CurrentAccountClass(Company_Name, Name, Contact_number, Mail_id, Type_of_Business);
				System.out.println("Account Created successfully!!!");
			}
			break;
		case "D":
			System.out.println("Accept terms and conditions to create account");
			break;

		default:
			break;
		}
		return a;

	}

	public AccountClass savingAccount(Scanner inputscan, HashMap<Long, AccountClass> savingsAccountList) {
		System.out.println("Enter Account holder name :");
		Name = inputscan.nextLine();
		System.out.println("Enter Contact Number :");
		Contact_number = inputscan.nextLine();
		System.out.println("Enter Mail id :");
		Mail_id = inputscan.nextLine();
		System.out.println("Terms and conditions \n (A)ccept (D)ecline");
		AccountClass a = null;
		switch (inputscan.next()) {
		case "A":
			boolean k = false;
			for (Map.Entry<Long, AccountClass> entry : savingsAccountList.entrySet()) {
				if (entry.getValue().getAccount_number().equals(Contact_number)
						&& entry.getValue().getMail_id().equals(Mail_id))
					;
				{
					System.out.println("Account exists already...");
					k = true;
					break;
				}
			}
			if (k == false) {
				a = new AccountClass(Name, Contact_number, Mail_id);

			}
			break;
		case "D":
			System.out.println("Accept terms and conditions to create account");
			break;

		default:
			break;
		}

		return a;
	}

}
