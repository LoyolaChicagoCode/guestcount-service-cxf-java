package guestcount;

/**
 * An interface for read-only access to the current guest count coming back from
 * the service. It is an example of the ValueObject (TransferObject) pattern.
 */
public interface GuestCount {

	int getLocalCount();

	int getTotalCount();
}