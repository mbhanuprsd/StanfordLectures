import stanford.karel.Karel;

public class CleanupKarel extends Karel {
	
	public void run() {
		cleanRow();
		while (leftIsClear()) {
			faceWestInNextRow();
			cleanRow();
			if (rightIsClear()) {
				faceEastInNextRow();
				cleanRow();
			} else {
				turnAround();
			}
		}
	}

	private void cleanRow() {
		if (beepersPresent()) {
			pickBeeper();
		}
		while (frontIsClear()) {
			move();
			if (beepersPresent()) {
				pickBeeper();
			}
		}
	}
	
	private void faceEastInNextRow() {
		turnRight();
		move();
		turnRight();
	}

	private void faceWestInNextRow() {
		turnLeft();
		move();
		turnLeft();
	}
	
	private void turnRight() {
		for (int i = 0; i < 3; i++) {
			turnLeft();
		}
	}
	
	private void turnAround() {
		turnLeft();
		turnLeft();
	}
}
