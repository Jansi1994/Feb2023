package org.bank;

public class BankInfo extends AxisBank  {
	public void saving() {
		System.out.println("saving : 30");
		}
	public void fixed() {
		System.out.println("fixed : 20");
	}

	public static void main(String[] args) {
		BankInfo data = new BankInfo();
		data.saving();
		data.fixed();
		data.deposit();
		data.deposit1();
	}
}