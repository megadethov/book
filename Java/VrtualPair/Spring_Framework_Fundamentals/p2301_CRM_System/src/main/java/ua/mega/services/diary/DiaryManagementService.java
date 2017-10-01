 package ua.mega.services.diary;

import ua.mega.domain.Action;

import java.util.List;

/**
 * This interface defines the functionality required in the Diary Management Service.
 */
public interface DiaryManagementService 
{
	/**
	 * Records an action in the diary
	 */
	public void recordAction(Action action);
	
	/**
	 * Gets all actions for a particular user that have not yet been complete
	 */
	public List<Action> getAllIncompleteActions(String requiredUser);
}
