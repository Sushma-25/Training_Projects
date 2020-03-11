package com.sushma.Assignment3;

import java.util.HashMap;
import java.util.Scanner;

public class BankExecClass {
	static double total_amount = 1200000;
	static HashMap<Long, AccountClass> savingsAccountList = new HashMap<Long, AccountClass>();
	static HashMap<Long, CurrentAccountClass> currentAccountList = new HashMap<Long, CurrentAccountClass>();

	public static void main(String[] args) {
		Scanner inputscan = new Scanner(System.in);
		System.out.println("Enter (A)ccount Opening, (W)ithdraw, (D)eposit, (R)eport");
		process(inputscan);
	}

	private static void process(Scanner inputscan) {
		switch (inputscan.next()) {
		case "A":

			BankOperations bankops = new BankOperations();
			System.out.println(".........Welcomee.........");
			System.out.println("select options (S)aving Account, (C)urrent Account.");

			switch (inputscan.nextLine()) {
			case "S":
				AccountClass a;
				a = bankops.savingAccount(inputscan, savingsAccountList);
				if (!a.equals(null)) {
					savingsAccountList.put(a.getAccount_number(), a);
					System.out.println("Account Created Successfully with Account Number " + a.getAccount_number());
				}
				break;
			case "C":
				CurrentAccountClass b;
				b = bankops.CurrentAccount(inputscan, currentAccountList);
				if (!b.equals(null)) {
					currentAccountList.put(b.getAccount_number(), b);
					System.out.println("Account Created Successfully with Account Number " + b.getAccount_number());
				}
				break;

			default:
				break;
			}

			break;
		case "D":

			System.out.println("select options (S)aving Account, (C)urrent Account.");

			switch (inputscan.next()) {
			case "S":
				System.out.println("Enter Account Number");
				long account_number = inputscan.nextLong();
				System.out.println("Enter Amount to deposit");
				double amount = inputscan.nextDouble();
				boolean b = false;
				if (amount >= 100000) {
					b = true;
					System.out.println("deposit limit per day is 1 lack ");
				}
				if (b == false) {
					AccountClass k = savingsAccountList.get(account_number);
					total_amount += amount;
					k.setBankBalance(k.getBankBalance() + amount);
				}
				break;
			case "C":
				System.out.println("Enter Account Number");
				long account_number1 = inputscan.nextLong();
				System.out.println("Enter Amount to deposit");
				double amount1 = inputscan.nextDouble();
				boolean b1 = false;
				if (amount1 >= 500000) {
					b1 = true;
					System.out.println("deposit limit per day is 5 lack ");
				}
				if (b1 == false) {
					CurrentAccountClass k = currentAccountList.get(account_number1);
					total_amount +=amount1;
					k.setBankBalance(k.getBankBalance() + amount1);
				}
				break;

			default:
				break;
			}
			break;
		case "W":

			System.out.println("select options (S)aving Account, (C)urrent Account.");

			switch (inputscan.next()) {
			case "S":
				System.out.println("Enter Account Number");
				long account_number = inputscan.nextLong();
				System.out.println("Enter Amount to Withdraw");
				double amount = inputscan.nextDouble();
				boolean b = false;
				if (amount > 75000) {
					b = true;
					System.out.println("Withdraw limit per day is 75000");
				}
				if (b == false) {
					AccountClass k = savingsAccountList.get(account_number);
					 double balance= k.getBankBalance() -amount;
					 if(balance<0)
					 {
						 System.out.println("Insufficient Bank balance");
					 }
					 else {
						
					k.setBankBalance(balance);
					total_amount -= balance;
				}}
				break;
			case "C":
				System.out.println("Enter Account Number");
				long account_number1 = inputscan.nextLong();
				System.out.println("Enter Amount to deposit");
				double amount1 = inputscan.nextDouble();
				boolean b1 = false;
				if (amount1 > 500000) {
					b1 = true;
					System.out.println("withdraw limit per day is 5 lack ");
				}
				if (b1 == false) {
					CurrentAccountClass k = currentAccountList.get(account_number1);
					double d=k.getBankBalance() - amount1;
					if(d<0)
					{k.setBankBalance(d);
					total_amount -= amount1;
					}else
						System.out.println("Insufficient bank balance.....");
				}
				break;

			default:
				break;
			}
			
			break;
		case "R":
			 System.out.printf("Intial bank balance %lf current bank balance %lf",1200000,total_amount);

			break;

		default:
			break;
		}
	}

}
