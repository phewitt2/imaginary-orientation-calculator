package studentOrientation.orientation;


import studentOrientation.util.Money;


public interface Orientation {
	/**
	 * @return cost taken for the entire orientation, in U.S. dollars
	 */
	public Money calculateCost();

	/**
	 * @return time taken for the entire orientation, in minutes
	 */
	public int calculateTime();

	/**
	 * @return effort taken for the entire orientation, in calories
	 */	
	public int calculateEffort();
}