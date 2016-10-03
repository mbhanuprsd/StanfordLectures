
/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends Karel {
	private boolean isAnotherRowPresent;
	
	public void run() {
		int noOfRow = 0;
		isAnotherRowPresent = true;
		while (isAnotherRowPresent) {
			boolean oddRow = noOfRow%2 == 0;
			fillRow(oddRow);
			moveToNextRow(oddRow);
			noOfRow++;
		}
	}

	private void fillRow(boolean oddRow) {
		if (frontIsBlocked() && oddRow) putBeeper();
		while (frontIsClear()) {
			putBeeper();
			move();
			if (frontIsClear()) {
				move();
			}
		}
		if (oddRow) {
			turnLeft();
		} else {
			turnRight();
		}
	}

	private void moveToNextRow(boolean oddRow) {
		if (frontIsClear()) {
			move();
			if (oddRow) turnLeft();
			else turnRight();
		} else {
			isAnotherRowPresent = false;
		}
	}

	private void turnRight() {
		for (int i = 0; i < 3; i++) {
			turnLeft();
		}
	}
}
