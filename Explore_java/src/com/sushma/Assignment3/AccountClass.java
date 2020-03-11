package com.sushma.Assignment3;

public class AccountClass {

	
		String Name, Contact_number, Mail_id;
		long Account_number;
		double bankBalance;

		

		@Override
		public String toString() {
			return "AccountClass [Name=" + Name + ", Contact_number=" + Contact_number + ", Mail_id=" + Mail_id
					+ ", Account_number=" + Account_number + ", bankBalance=" + bankBalance + "]";
		}

		public AccountClass() {
			super();
		}

		public AccountClass(String name, String contact_number, String mail_id) {
			super();
			Account_number=(long)(Math.random()*1000);
			Name = name;
			Contact_number = contact_number;
			Mail_id = mail_id;
			bankBalance=0;
		}

		

		public double getBankBalance() {
			return bankBalance;
		}

		public void setBankBalance(double bankBalance) {
			this.bankBalance = bankBalance;
		}

		public void setAccount_number(long account_number) {
			Account_number = account_number;
		}

		public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
		}

		public String getContact_number() {
			return Contact_number;
		}

		public void setContact_number(String contact_number) {
			Contact_number = contact_number;
		}

		public String getMail_id() {
			return Mail_id;
		}

		public void setMail_id(String mail_id) {
			Mail_id = mail_id;
		}

		public Long getAccount_number() {
			
			return Account_number;
		}
	
	
	
}
