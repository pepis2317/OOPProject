package models;

public class Rating {
	public double rate;
	public int count;
	public Rating() {}
	public Rating(double rate, int count) {
		super();
		this.rate = rate;
		this.count = count;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
}
