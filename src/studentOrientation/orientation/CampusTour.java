package studentOrientation.orientation;


import studentOrientation.orientation.Activity;
import java.util.ArrayList;
import java.util.Iterator;


public class CampusTour implements Activity {
	private Choice currentChoice;
	private ArrayList<Choice> choices;

	public CampusTour() {}
	
	public Choice getCurrentChoice() {
		return currentChoice;
	}

	public ArrayList<Choice> getChoices() {
		return choices;
	}

	public void addChoice(Choice choice) {
		choices.add(choice);
	}

	public void removeChoice(Choice choice) {
		Iterator<Choice> it = choices.iterator();
		while (it.hasNext()) {
			Choice c = it.next();
			if (c.equals(choice)) {
				it.remove();
			}
		}
	}

	public void choose(Choice choice) {
		this.currentChoice = choice;
	}
}
