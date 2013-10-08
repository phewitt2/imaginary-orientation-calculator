package studentOrientation.orientation;


import studentOrientation.orientation.Choice;
import java.util.ArrayList;


public interface Activity {
	/**
	 * @return currently selected choice for an activity
	 */
	public Choice getCurrentChoice();

	/**
	 * @return all possible choices for an activity
	 */
	public ArrayList<Choice> getChoices();

	/**
	 * Add a new choice for an activity.
	 */
	public void addChoice(Choice choice);

	/**
	 * Remove a choice for an activity.
	 */
	public void removeChoice(Choice choice);

	/**
	 * Select a choice for an activity.
	 */
	public void choose(Choice choice);
}
