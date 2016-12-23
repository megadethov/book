package ua.mega.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by mega on 23.12.2016.
 */
public class LogAspect {
    public Object onExecute(ProceedingJoinPoint pgp) throws Throwable {
        System.out.println("LogAspect Before execution of: " + pgp.getSignature().getName());
       Object result =  pgp.proceed();
        System.out.println("LogAspect After execution of: " + pgp.getSignature().getName());
        return result;
    }
}
