package Codes;

public class Date {
	protected int day, month, year;

	public Date() {
		day = 1;
		month = 1;
		year = 1990;
	}

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public String toString() {
		return "day=" + day + ", month=" + month + ", year=" + year ;
	}

}
