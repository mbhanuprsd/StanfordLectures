
/*
 * File: CollectNewspaperKarel.java
 * --------------------------------
 * At present, the CollectNewspaperKarel subclass does nothing.
 * Your job in the assignment is to add the necessary code to
 * instruct Karel to walk to the door of its house, pick up the
 * newspaper (represented by a beeper, of course), and then return
 * to its initial position in the upper left corner of the house.
 */

import stanford.karel.Karel;

public class CollectNewspaperKarel extends Karel {

	public void run() {
		moveToNewspaper();
		pickNewspaper();
		moveToIntialPosition();
	}

	private void moveToNewspaper() {
		move();
		move();
		turnRight();
		move();
		turnLeft();
		move();
	}
	
	private void pickNewspaper() {
		pickBeeper();
	}
	
	private void moveToIntialPosition() {
		turnAround();
		while (frontIsClear()) {
			move();
		}
		turnRight();
		move();
		turnRight();
	}
	
	private void turnRight() {
		turnLefts(3);
	}
	
	private void turnAround() {
		turnLefts(2);
	}
	
	private void turnLefts(int numberOfTurns) {
		for (int i = 0; i < numberOfTurns; i++) {
			turnLeft();
		}
	}
}
