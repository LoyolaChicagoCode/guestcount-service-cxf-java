package guestcount;

import javax.jws.WebService;

/**
 * An interface for the guest-counting (web) service.
 */
@WebService
public interface CountService {

	/**
	 * Counts a guest who enters through this door.
	 * 
	 * @return the current guest count
	 */
	GuestCount guestEnters();

	/**
	 * Counts a guest who leaves through this door.
	 * 
	 * @return the current guest count
	 */
	GuestCount guestLeaves();

	/**
	 * Returns the current guest count.
	 * 
	 * @return the current guest count
	 */
	GuestCount currentCount();
}
