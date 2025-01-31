package code;

import java.util.ArrayList;

public class GoalTracker {
	private int goal;
	private int currTotal = 0;
	private ArrayList<HistoryItem> historyItems = new ArrayList<HistoryItem>();
	
	// Ctor
	public GoalTracker(int goal) {
		this.goal = goal;
	}
	//this is a comment
	public boolean goalIsMet() {
		boolean success = currTotal >= goal;
		return success;
	}
	
	public int getGoal() {
		return goal;
	}
	
	public int getCurrTotal() {
		return currTotal;
	}
	
	public void addHistoryItem(HistoryItem historyItem) {
		historyItems.add(historyItem);
		currTotal += historyItem.getAmount();
	}
	
	public int getDeficit() {
		return goal - currTotal;
	}
}
