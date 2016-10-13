import stanford.karel.Karel;

public class DoubleTheBeepersKarel extends Karel {
	
	public void run() {
		move();
		doubleTheBeepersInPile();
		moveBackwards();
	}

	private void doubleTheBeepersInPile() {
		int beeperCount = countNoOfBeepersInPile();
		for (int i = 0; i < 2*beeperCount; i++) {
			putBeeper();
		}
	}
	
	private int countNoOfBeepersInPile() {
		int numberOfBeepers = 0;
		while (beepersPresent()) {
			pickBeeper();
			numberOfBeepers++;
		}
		return numberOfBeepers;
	}

	private void moveBackwards() {
		turnAround();
		move();
		turnAround();
	}

	private void turnAround() {
		for (int i = 0; i < 2; i++) {
			turnLeft();			
		}
	}
}
