package studentOrientation.util;


public class USMoney implements Money {
	private int dollars = 0;
	private int cents = 0;

	public USMoney(int dollars, int cents) {
		this.dollars = dollars;
		this.cents = cents;
	}

	public int getDollars() {
		return this.dollars;
	}

	public int getCents() {
		return this.cents;	
	}

	public int getTotalCents() {
		return 100 * this.dollars + this.cents;
	}

	public String toString() {
		return "$" + String.valueOf(this.dollars) + "." + String.valueOf(this.cents);
	}
}
