package ua.mega.staffmanagement;

import javax.ejb.ApplicationException;

@ApplicationException(rollback = true)
public class SystemUnavailableException extends Exception {
}
