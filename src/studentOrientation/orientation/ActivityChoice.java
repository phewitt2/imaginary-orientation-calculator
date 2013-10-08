package studentOrientation.orientation;


import studentOrientation.util.Money;
import studentOrientation.util.USMoney;


public class ActivityChoice implements Choice {
	private String  name;
	private int     time;
	private USMoney cost;
	private int     effort;

	public ActivityChoice(String name, int time, USMoney cost, int effort) {
		this.name = name;
		this.time = time;
		this.cost = cost;
		this.effort = effort;
	}

	public String getName() {
		return name;
	}

	public int getTime() {
		return time;
	}

	public Money getCost() {
		return cost;
	}

	public int getEffort() {
		return effort;
	}

	@Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        ActivityChoice choice = (ActivityChoice) obj;
        return this.name != null && this.name.equals(choice.getName());
    }
}
