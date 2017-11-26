/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {

	public void run()
	{
		fillOddColumn();
		do {
			if (frontIsClear()) {
				move();
				fillEvenColumn();
			}
			if (frontIsClear()) {
				move();
				fillOddColumn();
			}
		} while(frontIsClear());
	}
	
	private void fillOddColumn() {
		turnLeft();
		putBeeper();
		while (frontIsClear()) {
			move();
			if (frontIsClear()) {
				move();
				putBeeper();
			}
		}
		goBack();
	}
	
	private void fillEvenColumn() {
		turnLeft();
		while (frontIsClear()) {
			move();
			putBeeper();
			if (frontIsClear()) {
				move();
			}
		}
		goBack();
	}
	
	private void goBack()
	{
		turnAround();
		while(frontIsClear()) {
			move();
		}
		turnLeft();
	}

}
