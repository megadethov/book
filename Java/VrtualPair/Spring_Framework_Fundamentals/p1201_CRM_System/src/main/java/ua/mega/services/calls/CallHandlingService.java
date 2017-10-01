package ua.mega.services.calls;

import ua.mega.domain.Action;
import ua.mega.domain.Call;
import ua.mega.services.customers.CustomerNotFoundException;

import java.util.Collection;


public interface CallHandlingService 
{
	/**
	 * Records a call with the customer management service, and also records
	 * any actions in the diary service
	 */
	public void recordCall(String customerId, Call newCall, Collection<Action> actions) throws CustomerNotFoundException;
}
