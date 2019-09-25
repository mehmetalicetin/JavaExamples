/**
 * 
 */
package com.cetin.i2i.watch;

/**
 * A class to measure time elapsed.
 * 
 * @author mehmetali.cetin
 *
 */
public class StopWatch {

	public static final double NANOS_PER_SEC = 1000000000.0;

	// instance variables
	private static long startTime; // it keeps start time any process.
	private static long stopTime; // it keeps stop time any process.

	/**
	 * This method is taken startTime.
	 */
	public static void start() {
		startTime = System.nanoTime();
	}

	/**
	 * This method is taken stopTime.
	 */
	public static void stop() {
		stopTime = System.nanoTime();
	}

	/**
	 * elapsed time in seconds.
	 * 
	 * @return the time recorded on the stopwatch in seconds
	 */
	public static double time() {
		return (stopTime - startTime) / NANOS_PER_SEC;
	}

	@Override
	public String toString() {
		return "elapsed time: " + time() + " seconds.";
	}

	/**
	 * elapsed time in nanoseconds.
	 * 
	 * @return the time recorded on the stopwatch in nanoseconds
	 */
	public static long timeInNanoseconds() {
		return (stopTime - startTime);
	}

}
