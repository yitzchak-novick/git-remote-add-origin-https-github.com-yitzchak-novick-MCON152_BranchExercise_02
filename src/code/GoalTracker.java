package code;

import java.util.ArrayList;

public class GoalTracker {
	private int goal;
	private int currTotal = 0;
	private ArrayList<HistoryItem> historyItems = new ArrayList<HistoryItem>();
	
	public GoalTracker(int goal) {
		this.goal = goal;
	}
	
	public boolean goalIsMet() {
		return currTotal >= goal;
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
}
