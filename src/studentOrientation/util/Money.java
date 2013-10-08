package studentOrientation.util;


/**
 * NOTE: Money overflow? Pshaw! We're dirt-poor college students.
 */
public interface Money {
	/**
	 * @return cents portion of the amount of money
	 */
	public int getCents();

	/**
	 * @return total number of cents, with dollars converted to cents
	 */
	public int getTotalCents();

	/**
	 * @return dollars portion of the amount of money
	 */
	public int getDollars();

	/**
	 * @return string representation of the amount of money
	 */
	public String toString();
}