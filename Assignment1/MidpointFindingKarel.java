/*
 * File: MidpointFindingKarel.java
 * -------------------------------
 * When you finish writing it, the MidpointFindingKarel class should
 * leave a beeper on the corner closest to the center of 1st Street
 * (or either of the two central corners if 1st Street has an even
 * number of corners).  Karel can put down additional beepers as it
 * looks for the midpoint, but must pick them up again before it
 * stops.  The world may be of any size, but you are allowed to
 * assume that it is at least as tall as it is wide.
 */

import stanford.karel.*;

public class MidpointFindingKarel extends Karel {
	public void run() {
		placeBeeperInMidpoint(checkNumberOfStreets());		
	}
	
	private int checkNumberOfStreets() {
		int noOfStreets = 0;
		while (frontIsClear()) {
			move();
			noOfStreets++;
		}
		return noOfStreets;
	}
	
	private void placeBeeperInMidpoint(int noOfStreets) {
		turnAround();
		for (int i = 0; i < noOfStreets/2; i++) {
			move();
		}
		putBeeper();
	}
	
	private void turnAround() {
		for (int i = 0; i < 2; i++) {
			turnLeft();
		}
	}
}
