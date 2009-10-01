package guestcount;

/**
 * An implementation of the guest-counting (web) service. Thread safety is
 * required because method invocations are tied to incoming servlet requests,
 * which may overlap in time. This class delegates thread safety to its two
 * thread-safe Counter subobjects. The total counter value observed by a local
 * door is approximate because of possible overlapping activity at other doors.
 */
public class Door implements CountService, TotalCountAware {

	/**
	 * The counter for this door.
	 */
	private Counter local = new DefaultCounter();

	/**
	 * The shared total counter.
	 */
	private Counter total;

	/*
	 * (non-Javadoc)
	 * 
	 * @see guestcount.TotalCountAware#setTotalCount(guestcount.Counter)
	 */
	public void setTotalCount(Counter total) {
		this.total = total;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see guestcount.CountService#guestEnters()
	 */
	@Override
	public GuestCount guestEnters() {
		return createGuestCount(local.inc(), total.inc());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see guestcount.CountService#guestLeaves()
	 */
	@Override
	public GuestCount guestLeaves() {
		return createGuestCount(local.dec(), total.dec());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see guestcount.CountService#currentCount()
	 */
	@Override
	public GuestCount currentCount() {
		return createGuestCount(local.get(), total.get());
	}

	protected GuestCount createGuestCount(int localCount, int totalCount) {
		final DefaultGuestCount result = new DefaultGuestCount();
		result.setLocalCount(localCount);
		result.setTotalCount(totalCount);
		return result;
	}
}