package guestcount;

/**
 * An interface for components that depend on the shared total counter.
 */
public interface TotalCountAware {

	/**
	 * Injects this object's dependency on the shared total counter.
	 * 
	 * @param counter
	 *            the shared total counter
	 */
	void setTotalCount(Counter counter);
}
