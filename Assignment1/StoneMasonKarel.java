/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */

import stanford.karel.*;

public class StoneMasonKarel extends Karel {
	
	private boolean isColumnAvailableToRepair = true;

	public void run() {
		while (isColumnAvailableToRepair) {
			repairColumn();
			getDownTheRepairedColumn();
			moveToNextColumn();
		}
	}
	
	private void repairColumn() {
		turnLeft();
		if (frontIsBlocked() && noBeepersPresent()) {
			putBeeper();
		}
		while (frontIsClear()) {
			if (noBeepersPresent()) {
				putBeeper();
			}
			move();
			if (noBeepersPresent()) {
				putBeeper();
			}
		}
	}
	
	private void getDownTheRepairedColumn() {
		turnAround();
		while (frontIsClear()) {
			move();
		}
		turnLeft();
		isColumnAvailableToRepair = false;
	}
	
	private void moveToNextColumn() {
		for (int i = 0; i < 4; i++) {
			if (frontIsClear()) {
				move();
				isColumnAvailableToRepair = (i == 3);
			}
		}
	}
	
	private void turnAround() {
		turnLefts(2);
	}
	
	private void turnLefts(int noOfLefts) {
		for (int i = 0; i < noOfLefts; i++) {
			turnLeft();
		}
	}
}
