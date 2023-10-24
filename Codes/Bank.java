package Codes;

public class Bank {
	protected int bankid;
	protected String name;
	protected double balance;
	private Locker locobj;

	public void assign(int duration) {
		this.locobj = new Locker(duration);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBankid() {
		return bankid;
	}

	public double getBalance() {
		return balance;
	}

	public Bank(int bankid, String name, double balance) {
		this.bankid = bankid;
		this.name = name;
		this.balance = balance;
	}

	void assignlocker(int duration) {
		locobj = new Locker(duration);
	}

	public String toString() {
		if (locobj != null)
			return "BankID = " + bankid + " Name =  " + name + " Balance =  " + balance + "   " + locobj;

		return "BankID = " + bankid + " Name =  " + name + " Balance =  " + balance + "   " + "Locker Not Applied";
	}

	private class Locker {
		public int lockid = 100;
		public double charges = 500;
		public int duration;

		public Locker(int duration) {
			lockid++;
			this.duration = duration;
			this.charges = this.charges * duration;
		}

		public void setDuration(int duration) {
			this.duration = duration;
		}

		public String toString() {
			return "Locker ID = " + lockid + "  duration = " + duration + " charges = " + charges;
		}
	}

}
