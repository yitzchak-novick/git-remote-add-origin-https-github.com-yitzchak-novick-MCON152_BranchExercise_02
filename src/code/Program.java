package code;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		GoalTracker goalTracker;
		Scanner keyboardInput = new Scanner(System.in);
		System.out.println("Enter the goal amount: ");
		int goalAmount = keyboardInput.nextInt();
		while (goalAmount <= 0) {
			System.out.println("Invalid goal amount, please enter a positive amount: ");
			goalAmount = keyboardInput.nextInt();
		}
		keyboardInput.nextLine();
		goalTracker = new GoalTracker(goalAmount);
		while (!goalTracker.goalIsMet()) {
			System.out.println("Enter a new accomplished amount: ");
			int accomplishedAmount = keyboardInput.nextInt();
			while (accomplishedAmount <= 0) {
				System.out.println("That amount is invalid, please enter a positive amount: ");
				accomplishedAmount = keyboardInput.nextInt();
			}
			goalTracker.addHistoryItem(new HistoryItem(accomplishedAmount));
		}
		System.out.println("Goal met");
		if (goalTracker.getCurrTotal() > goalTracker.getGoal()) {
			System.out.println("Goal was exceeded by " + (goalTracker.getGoal() - goalTracker.getCurrTotal()));
		}
	}

}
