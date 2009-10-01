package guestcount;

/**
 * An thread-safe implementation of a simple counter.
 */
public class DefaultCounter implements Counter {

	private int count;

	/* (non-Javadoc)
	 * @see guestcount.Counter#dec()
	 */
	@Override
	public synchronized int dec() {
		return --count;
	}

	/* (non-Javadoc)
	 * @see guestcount.Counter#get()
	 */
	@Override
	public synchronized int get() {
		return count;
	}

	/* (non-Javadoc)
	 * @see guestcount.Counter#inc()
	 */
	@Override
	public synchronized int inc() {
		return ++count;
	}
}