package guestcount;

/**
 * This bean represents the current guest count coming back from the service. It
 * is an example of the ValueObject (TransferObject) pattern.
 */
public class DefaultGuestCount implements GuestCount {

	private int localCount;

	private int totalCount;

	/*
	 * (non-Javadoc)
	 * 
	 * @see guestcount.GuestCount#getLocalCount()
	 */
	@Override
	public int getLocalCount() {
		// TODO Auto-generated method stub
		return localCount;
	}

	/**
	 * Sets the total counter value.
	 * 
	 * @param localCount the total counter value
	 */
	public void setLocalCount(int localCount) {
		this.localCount = localCount;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see guestcount.GuestCount#getTotalCount()
	 */
	@Override
	public int getTotalCount() {
		// TODO Auto-generated method stub
		return totalCount;
	}

	/**
	 * Sets the total counter value.
	 * 
	 * @param totalCount the total counter value
	 */
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
}