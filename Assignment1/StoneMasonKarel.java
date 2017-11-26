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

public class StoneMasonKarel extends SuperKarel {

	public void run() {
		fixColumn();
		while (frontIsClear()) {
			moveToNextColumn();
			fixColumn();
		}
	}
	
	private void moveToNextColumn() {
		for (int i = 0; i < 4; i++) {
			move();
		}
	}
	
	private void fixColumn() {
		fillColumn();
		moveToColumnStart();
	}
	
	private void fillColumn() {
		turnLeft();
		if(noBeepersPresent()) {
			putBeeper();
		}
		while(frontIsClear()) {
			move();
			if(noBeepersPresent()) {
				putBeeper();
			}
			
		}
	}
	
	private void moveToColumnStart() {
		turnAround();
		while(frontIsClear()) {
			move();
		}
		turnLeft();
	}

}
