package studentOrientation.orientation;


import studentOrientation.util.Money;


public interface Choice {
	/**
	 * @return identifying phrase for the choice
	 */
	public String getName();

	/**
	 * @return time (in minutes) taken for this choice of activity
	 */
	public int getTime();

	/**
	 * @return amount of money spent for this choice of activity
	 */
	public Money getCost();

	/**
	 * @return number of calories spent for this choice of activity
	 */
	public int getEffort();
}