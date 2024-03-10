package Java1;

public class DateClass {
	private int date;
	private int month;
	private int year;
	
	
	public DateClass(int date, int month, int year) {
		// TODO Auto-generated constructor stub
		this.date=date;
		this.month = month;
		this.year = year;
	}



	public int getDate() {
		return date;
	}


	public void setDate(int date) {
		if(this.date<=31 && this.date>0) {
			this.date = date;
		}
		else
		{
			System.out.println(date+" is invalid ");
		}
	}


	public int getMonth() {
		return month;
	}


	public void setMonth(int month) {
		this.month = month;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}
	public void display() {
		System.out.println(this.date+"/"+ this.month+"/"+ this.year);
	}
	
}
