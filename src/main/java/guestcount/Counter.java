package guestcount;

/**
 * An interface for a simple counter.
 */
public interface Counter {

	/**
	 * Increments the counter value.
	 * 
	 * @return the resulting counter value
	 */
	int inc();

	/**
	 * Decrements the counter value.
	 * 
	 * @return the resulting counter value
	 */
	int dec();

	/**
	 * Returns the current counter value.
	 * 
	 * @return the current counter value
	 */
	int get();
}