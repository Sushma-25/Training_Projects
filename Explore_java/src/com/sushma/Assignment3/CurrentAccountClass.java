package com.sushma.Assignment3;

public class CurrentAccountClass {

	String Company_Name, Representative_Name, Contact_No, Mail_id, Type_of_Business;
	long Account_number;
	double bankBalance;

	public CurrentAccountClass(String company_Name, String representative_Name, String contact_No, String mail_id,
			String type_of_Business) {
		super();
		Account_number = (long) (Math.random());
		Company_Name = company_Name;
		Representative_Name = representative_Name;
		Contact_No = contact_No;
		Mail_id = mail_id;
		Type_of_Business = type_of_Business;
		bankBalance = 0;
	}

	public String getCompany_Name() {
		return Company_Name;
	}

	public void setCompany_Name(String company_Name) {
		Company_Name = company_Name;
	}

	public String getRepresentative_Name() {
		return Representative_Name;
	}

	public void setRepresentative_Name(String representative_Name) {
		Representative_Name = representative_Name;
	}

	public String getContact_No() {
		return Contact_No;
	}

	public void setContact_No(String contact_No) {
		Contact_No = contact_No;
	}

	public String getMail_id() {
		return Mail_id;
	}

	public void setMail_id(String mail_id) {
		Mail_id = mail_id;
	}

	public String getType_of_Business() {
		return Type_of_Business;
	}

	public void setType_of_Business(String type_of_Business) {
		Type_of_Business = type_of_Business;
	}

	public long getAccount_number() {
		return Account_number;
	}

	public void setAccount_number(long account_number) {
		Account_number = account_number;
	}

	public double getBankBalance() {
		return bankBalance;
	}

	public void setBankBalance(double bankBalance) {
		this.bankBalance = bankBalance;
	}

	@Override
	public String toString() {
		return "CurrentAccountClass [Company_Name=" + Company_Name + ", Representative_Name=" + Representative_Name
				+ ", Contact_No=" + Contact_No + ", Mail_id=" + Mail_id + ", Type_of_Business=" + Type_of_Business
				+ ", Account_number=" + Account_number + ", bankBalance=" + bankBalance + "]";
	}

}
