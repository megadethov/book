package ua.mega.staffmanagement;

import javax.ejb.ApplicationException;

//@ApplicationException(rollback = true) // need only for checked Exception!!!
public class SystemUnavailableException extends RuntimeException {

}
